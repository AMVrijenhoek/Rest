package com.example.accessingdatarest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
	@Override
	protected void configure(HttpSecurity http) throws Exception {
        http.csrf().disable();
        // http
        //     .csrf().disable()
        //     .authorizeRequests().anyRequest().authenticated()
        //     .and()
        //     .httpBasic();
        
        // http
		// 	.authorizeRequests()
		// 		.antMatchers("/home").permitAll()
		// 		.anyRequest().authenticated()
		// 		.and()
		// 	.formLogin()
		// 		.loginPage("/login")
		// 		.permitAll()
		// 		.and()
		// 	.logout()
		// 		.permitAll();
	}

    // @Autowired
    // public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception{
    //     auth.inMemoryAuthentication()
    //         .withUser("user")
    //         .password("password")
    //         .roles("USER");
    // }

	// @Bean
	// @Override
	// public UserDetailsService userDetailsService() {
	// 	UserDetails user =
	// 		 User.withDefaultPasswordEncoder()
	// 			.username("user")
	// 			.password("password")
	// 			.roles("USER")
	// 			.build();

	// 	return new InMemoryUserDetailsManager(user);
	// }
}