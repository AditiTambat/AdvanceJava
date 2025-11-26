package com.security.DaoAcess.Config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfiguration {
	
	
	@Autowired
	private UserDetailsserviceimpl myuserdetailsserivce;
	
	@Bean
	public SecurityFilterChain mysecurity(HttpSecurity http) throws Exception
	{
		
	        http
	            // 1. ENABLE CORS Integration
	            // This tells Spring Security to look for and use the global 
	            // CorsConfigurationSource bean (like the CorsConfig class below).
	            .cors(Customizer.withDefaults()) 
	            .csrf(csrf -> csrf.disable())
	            .authorizeHttpRequests(authorize -> authorize
	                .requestMatchers(HttpMethod.OPTIONS, "/**").permitAll() 
	                .requestMatchers(HttpMethod.POST).hasRole("ADMIN")
	                .requestMatchers(HttpMethod.GET).hasAnyRole("ADMIN", "USER")
	                .anyRequest().authenticated()
	            )
	            
	            
	            .httpBasic(Customizer.withDefaults());

	        return http.build();
	}
	
	
//	@Bean
//	public AuthenticationProvider mysecuritys()
//	{
//		DaoAuthenticationProvider provider=new DaoAuthenticationProvider();
//		
//		provider.setPasswordEncoder(new BCryptPasswordEncoder(5));
//		provider.setUserDetailsService(myuserdetailsserivce);
//		
//		return provider;
//	}
	
	@Bean
	public PasswordEncoder mypassword()
	{
		return new BCryptPasswordEncoder(5);
	}

	
	
}
