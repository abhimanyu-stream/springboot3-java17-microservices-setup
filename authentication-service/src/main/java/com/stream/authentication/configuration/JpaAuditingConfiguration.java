package com.stream.authentication.configuration;


import com.stream.authentication.service.CustomUserDetails;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.AuditorAware;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;

import java.util.Optional;

@Configuration
@EnableJpaAuditing(auditorAwareRef = "auditorProvider" )
public class JpaAuditingConfiguration {


    @Bean
    public AuditorAware<String> auditorProvider() {

        return new CustomAuditorAware();
    }

}

class  CustomAuditorAware implements AuditorAware<String> {


    @Override
    public Optional<String> getCurrentAuditor() {
        CustomUserDetails customUserDetails = null;
            Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
             Object o=  authentication.getPrincipal();
             if(o instanceof CustomUserDetails){
                 customUserDetails = (CustomUserDetails)o;
             }

            // getUsername() - Returns the username used to authenticate the user.
            //System.out.println("User name: " + customUserDetails.getUsername());
             if(customUserDetails != null)
             {
                 return Optional.ofNullable(customUserDetails.getUsername());
             }
            return Optional.ofNullable("System");
        };

}

