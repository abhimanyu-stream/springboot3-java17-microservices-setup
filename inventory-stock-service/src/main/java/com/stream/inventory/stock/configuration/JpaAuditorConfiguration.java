package com.stream.inventory.stock.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.AuditorAware;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;


import java.util.Optional;



@Configuration
@EnableJpaAuditing(auditorAwareRef = "auditorProvider")
public class JpaAuditorConfiguration {

    @Bean("auditorProvider")
    public AuditorAware<String> auditorProvider() {
        return new CustomAuditorAware();
    }
}

class  CustomAuditorAware implements AuditorAware<String> {

    @Override
    public Optional<String> getCurrentAuditor() {

        /*CustomUserDetails customUserDetails = null;
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        Object o=  authentication.getPrincipal();
        if(o instanceof CustomUserDetails){
            customUserDetails = (CustomUserDetails)o;
        }
        if(customUserDetails != null)
        {
            return Optional.ofNullable(customUserDetails.getUsername());
        }*/
        return Optional.ofNullable("System");//Return value: This method returns an instance of this Optional class with the specified value of the specified type. If the specified value is null, then this method returns an empty instance of the Optional class 
    };
}
