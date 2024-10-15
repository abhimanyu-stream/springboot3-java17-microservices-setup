package com.pay.springbootadminserver.configs;

import java.net.URI;
import java.util.UUID;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.web.server.ServerHttpSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.SavedRequestAwareAuthenticationSuccessHandler;
import org.springframework.security.web.csrf.CookieCsrfTokenRepository;
import org.springframework.security.web.server.SecurityWebFilterChain;
import org.springframework.security.web.server.authentication.RedirectServerAuthenticationSuccessHandler;
import org.springframework.security.web.server.authentication.ServerAuthenticationSuccessHandler;
import org.springframework.security.web.server.authentication.logout.RedirectServerLogoutSuccessHandler;
import org.springframework.security.web.server.authentication.logout.ServerLogoutSuccessHandler;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

import de.codecentric.boot.admin.server.config.AdminServerProperties;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig {

    private final AdminServerProperties adminServer;

    public WebSecurityConfig(AdminServerProperties adminServer) {
        this.adminServer = adminServer;
    }

    /*@Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        SavedRequestAwareAuthenticationSuccessHandler successHandler = new SavedRequestAwareAuthenticationSuccessHandler();
        successHandler.setTargetUrlParameter("redirectTo");
        successHandler.setDefaultTargetUrl(this.adminServer.getContextPath() + "/");

        http.authorizeHttpRequests(req -> req.requestMatchers(this.adminServer.getContextPath() + "/assets/**")
                .permitAll()
                .requestMatchers(this.adminServer.getContextPath() + "/login")
                .permitAll()
                .anyRequest()
                .authenticated())
            .formLogin(formLogin -> formLogin.loginPage(this.adminServer.getContextPath() + "/login")
                .successHandler(successHandler))
            .logout((logout) -> logout.logoutUrl(this.adminServer.getContextPath() + "/logout"))
            .httpBasic(Customizer.withDefaults())

            .csrf(csrf -> csrf.csrfTokenRepository(CookieCsrfTokenRepository.withHttpOnlyFalse())
                .ignoringRequestMatchers(
                    new AntPathRequestMatcher(this.adminServer.getContextPath() + "/instances", HttpMethod.POST.toString()),
                    new AntPathRequestMatcher(this.adminServer.getContextPath() + "/instances/*", HttpMethod.DELETE.toString()),
                    new AntPathRequestMatcher(this.adminServer.getContextPath() + "/actuator/**")))
            .rememberMe(rememberMe -> rememberMe.key(UUID.randomUUID()
                    .toString())
                .tokenValiditySeconds(1209600));
        return http.build();
    }*/
    @Bean
    @Profile("secure")
    public SecurityWebFilterChain securityWebFilterChainSecure(ServerHttpSecurity http) {
        return http
                .authorizeExchange(
                        (authorizeExchange) -> authorizeExchange.pathMatchers(this.adminServer.path("/assets/**"))
                                .permitAll()
                                .pathMatchers("/actuator/health/**")
                                .permitAll()
                                .pathMatchers(this.adminServer.path("/login"))
                                .permitAll()
                                .anyExchange()
                                .authenticated())
                .formLogin((formLogin) -> formLogin.loginPage(this.adminServer.path("/login"))
                        .authenticationSuccessHandler(loginSuccessHandler(this.adminServer.path("/"))))
                .logout((logout) -> logout.logoutUrl(this.adminServer.path("/logout"))
                        .logoutSuccessHandler(logoutSuccessHandler(this.adminServer.path("/login?logout"))))
                .httpBasic(Customizer.withDefaults())
                .csrf(ServerHttpSecurity.CsrfSpec::disable)
                .build();
    }

    // The following two methods are only required when setting a custom base-path (see
    // 'basepath' profile in application.yml)
    private ServerLogoutSuccessHandler logoutSuccessHandler(String uri) {
        RedirectServerLogoutSuccessHandler successHandler = new RedirectServerLogoutSuccessHandler();
        successHandler.setLogoutSuccessUrl(URI.create(uri));
        return successHandler;
    }

    private ServerAuthenticationSuccessHandler loginSuccessHandler(String uri) {
        RedirectServerAuthenticationSuccessHandler successHandler = new RedirectServerAuthenticationSuccessHandler();
        successHandler.setLocation(URI.create(uri));
        return successHandler;
    }

}
