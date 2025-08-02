package com.project.team3.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception{
        http
            .csrf().disable()
            .authorizeHttpRequests()
                .requestMatchers("/fd/calculate-maturity").permitAll()  // FD API: public
                .anyRequest().authenticated()              // everything else: secured
            .and()
            .formLogin().disable()  // remove if you're adding login later
            .httpBasic().disable();
        return http.build();
    }
}
