package com.tu.abnormality.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.tu.abnormality.converter.RegisterViewConverter;
import com.tu.abnormality.model.entities.Role;
import com.tu.abnormality.model.entities.User;
import com.tu.abnormality.model.entities.Vendor;
import com.tu.abnormality.model.views.RegisterView;
import com.tu.abnormality.service.interfaces.RoleService;
import com.tu.abnormality.services.UserServiceImpl;

@Controller
public class RegisterController {
	@Autowired
	private UserServiceImpl userService;
	@Autowired 
	private RoleService roleService;

	@Autowired
	private RegisterViewConverter userViewConverter;

	@GetMapping("/register")
	public ModelAndView get(RegisterView userView) {
		return new ModelAndView("/register").addObject("user", userView);
	}
	
	@PostMapping("/register")
	public ModelAndView register(@Valid @ModelAttribute("user") RegisterView userView, BindingResult result, Model model) {
		ModelAndView modelAndView = new ModelAndView("/register");
		
		if (result.hasErrors()) {
			return modelAndView;
		}
		
		if (userService.existsWithGivenUsername(userView.getUsername())) {
			return modelAndView
					.addObject("userExists", "There is already user with the given username.")
					.addObject("user", userView);
		}
		
		User user = userViewConverter.convertToUser(userView);
		userService.create(user);
		return modelAndView
				.addObject("registeredSuccessfully","You have been registered successfully!");
	}
	
	@ModelAttribute("roles")
	public List<Role> getRole() {
		return roleService.getAllRoles();
	}

}
