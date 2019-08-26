package com.tu.abnormality.configuration;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class SecurityConfiguration extends WebSecurityConfigurerAdapter  {
	@Autowired
	private DataSource dataSource;

	private AuthenticationSuccessHandler authenticationSuccessHandler;
	
	  @Autowired
	    public void WebSecurityConfig(AuthenticationSuccessHandler authenticationSuccessHandler) {
	        this.authenticationSuccessHandler = authenticationSuccessHandler;
	    }
	
	/**
	 * Adds JDBC Authentication
	 * @param auth
	 * @throws Exception 
	 */
	@Autowired
	public void configAuthentication(AuthenticationManagerBuilder auth) throws Exception {
		  auth.jdbcAuthentication().dataSource(dataSource)
			.usersByUsernameQuery(
				"SELECT username, password, true FROM user WHERE username=?")
			.authoritiesByUsernameQuery("SELECT username, role.description " + 
					"FROM user " + 
					"JOIN role ON user.role_id = role.id WHERE username=?");
	}
	
	
	/**
	 * 
	 * Configures the HttpSecurity.
	 * 
	 * In order to visit "/admin/**" URLs, the visitor should have the Authority "Administrator".
	 * In order to visit "/user/**" URLs, the visitor should have either "Administrator" or "Basic User" Authority.
	 * 
	 * All other URLs are allowed by anyone.
	 * 
	 * The URL to which users are sent if login is required is "/login"
	 * After authenticating successfully, the users will go to "/user/profile" URL.
	 * 
	 * @param http
	 * 
	 */
	@Override
	protected void configure(HttpSecurity http) throws Exception {		
		http
		.authorizeRequests()
		.antMatchers("/login", "/styles/**", "/img/**").permitAll()
		.antMatchers("/admin", "/register").hasAnyAuthority("Administrator")
		.antMatchers("/user").hasAnyAuthority("User")
		.antMatchers("/add", "/search").hasAnyAuthority("Administrator","User")
		.anyRequest().authenticated()
		.and()
	.formLogin()
		.loginPage("/login")
		.permitAll()
		.usernameParameter("username")
		.passwordParameter("password")
		.successHandler(authenticationSuccessHandler)
		.and()
	.logout()
		.permitAll();
	}	
}
