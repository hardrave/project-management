package com.michal.pma.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.michal.pma.dao.EmployeeRepository;
import com.michal.pma.dao.ProjectRepository;
import com.michal.pma.entities.Employee;
import com.michal.pma.entities.Project;

@Controller
public class HomeController {

	@Autowired
	ProjectRepository proRepo;
	
	@Autowired
	EmployeeRepository empRepo;
	
	@GetMapping("/")
	public String displayHome(Model model) {
		List<Project> projects = proRepo.findAll();
		model.addAttribute("projects", projects);
		List<Employee> employee = empRepo.findAll();
		model.addAttribute("employee", employee);
		return "home";
	}
	
}
