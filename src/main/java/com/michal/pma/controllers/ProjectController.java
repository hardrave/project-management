package com.michal.pma.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.michal.pma.dao.ProjectRepository;
import com.michal.pma.entities.Project;

@Controller
@RequestMapping("/projects")
public class ProjectController {
   
	@Autowired
	ProjectRepository proRepo;
	
	@GetMapping("/new")
	public String displayProjectForm(Model model) {
		
		Project aproject = new Project();
		model.addAttribute("project", aproject);
		
		return "projects/new-project";
	}
	@PostMapping("/save")
	public String createProject(Project project, Model model) {
		// this should handle saving to the database
		proRepo.save(project);
	    return "redirect:/projects/new";
	}
}
