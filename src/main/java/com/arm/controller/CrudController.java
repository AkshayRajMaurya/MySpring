package com.arm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.arm.domain.Users;
import com.arm.services.DataService;

@Controller
public class CrudController {

	@Autowired
	DataService dataService;

	@RequestMapping("/login")
	public ModelAndView getLogin(@ModelAttribute Users users) {
		return new ModelAndView("login");
	}
	
	@RequestMapping("/loginSuccess")
	public ModelAndView processLogin(@ModelAttribute Users users) {
		return new ModelAndView("redirect:success");
	}
	
	@RequestMapping("/register")
	public ModelAndView getRegister(@ModelAttribute Users users) {
		return new ModelAndView("register");
	}

	@RequestMapping("/registerSuccess")
	public ModelAndView registerUser(@ModelAttribute Users users) {
		dataService.insertRow(users);
		return new ModelAndView("redirect:success");
	}


}
