package com.tu.abnormality.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.dao.annotation.PersistenceExceptionTranslationPostProcessor;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;

import com.tu.abnormality.converter.RegisterViewConverter;
import com.tu.abnormality.repository.RoleRepositoryImpl;
import com.tu.abnormality.repository.UserRepositoryImpl;
import com.tu.abnormality.services.RoleServiceImpl;
import com.tu.abnormality.services.UserServiceImpl;

@Configuration
public class BeanConfiguration {

	@Bean
	public RoleRepositoryImpl roleRepository() {
		return new RoleRepositoryImpl();
	}

	@Bean
	public UserRepositoryImpl userRepository() {
		return new UserRepositoryImpl();
	}

	@Bean
	public RoleServiceImpl roleService() {
		return new RoleServiceImpl();
	}

	@Bean
	public UserServiceImpl userService() {
		return new UserServiceImpl();
	}

	@Bean
	public RegisterViewConverter userViewConverter() {
		return new RegisterViewConverter();
	}

	@Bean
	public BCryptPasswordEncoder encoder() {
		return new BCryptPasswordEncoder();
	}

	@Bean
	public PersistenceExceptionTranslationPostProcessor exceptionTranslation() {
		return new PersistenceExceptionTranslationPostProcessor();
	}

	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/resources/**").addResourceLocations("/resources/");
	}

}
