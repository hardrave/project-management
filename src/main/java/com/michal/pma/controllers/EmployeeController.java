package com.michal.pma.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.michal.pma.dao.EmployeeRepository;
import com.michal.pma.entities.Employee;


@Controller
@RequestMapping("/employee")
public class EmployeeController {
   
	@Autowired
	EmployeeRepository empRepo;
	
	@GetMapping("/new")
	public String displayEmployeeForm(Model model) {
		
		Employee aemployee = new Employee();
		model.addAttribute("employee", aemployee);
		
		return "employees/new-employee";
	}
	@PostMapping("/save")
	public String createEmployee(Employee employee, Model model) {
		// this should handle saving to the database
		empRepo.save(employee);
	    return "redirect:/employee/new";
	}
}
