package com.example.pastelfarms.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.csrf.CookieCsrfTokenRepository;

@Configuration
@Import(CorsConfig.class)
public class SecurityConfig {

    @Bean
    SecurityFilterChain defaultSecurityFilterChain(HttpSecurity http) throws Exception {
        return http.authorizeHttpRequests((authorize) -> authorize
                        .requestMatchers("/profile", "/profile/**", "/edit/profile").authenticated()
                        .requestMatchers("/register", "/login", "/home", "/", "/about", "/contact", "/send-email", "/welcome", "/error", "/pizzaProject", "/codeupProject", "/coffeeProject", "/konamiProject", "/weathermap", "/movieproject", "/projectList").permitAll()
                        .requestMatchers("/css/**", "/js/**", "/images/**", "/keys.js").permitAll()
                )
                .formLogin((login) -> login.loginPage("/login").defaultSuccessUrl("/profile"))
                .logout((logout) -> logout.logoutSuccessUrl("/home"))
                .csrf(csrf -> csrf
                        .csrfTokenRepository(CookieCsrfTokenRepository.withHttpOnlyFalse()))
                .build();
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return NoOpPasswordEncoder.getInstance();
    }

    @Bean
    public CookieCsrfTokenRepository csrfTokenRepository() {
        return CookieCsrfTokenRepository.withHttpOnlyFalse();
    }
}