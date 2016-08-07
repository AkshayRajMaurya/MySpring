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

	@RequestMapping("form")
	public ModelAndView getForm(@ModelAttribute Users users) {
		return new ModelAndView("form");
	}

	@RequestMapping("register")
	public ModelAndView registerUser(@ModelAttribute Users users) {
		dataService.insertRow(users);
		return new ModelAndView("redirect:list");
	}

	@RequestMapping("list")
	public ModelAndView getList() {
		List employeeList = dataService.getList();
		return new ModelAndView("list", "employeeList", employeeList);
	}

	@RequestMapping("delete")
	public ModelAndView deleteUser(@RequestParam int id) {
		dataService.deleteRow(id);
		return new ModelAndView("redirect:list");
	}

	@RequestMapping("edit")
	public ModelAndView editUser(@RequestParam int id,
			@ModelAttribute Users users) {
		Users employeeObject = dataService.getRowById(id);
		return new ModelAndView("edit", "employeeObject", employeeObject);
	}

	@RequestMapping("update")
	public ModelAndView updateUser(@ModelAttribute Users users) {
		dataService.updateRow(users);
		return new ModelAndView("redirect:list");
	}

}