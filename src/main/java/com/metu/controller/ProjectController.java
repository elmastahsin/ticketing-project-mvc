package com.metu.controller;

import com.metu.dto.ProjectDTO;
import com.metu.service.ProjectService;
import com.metu.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/project")
public class ProjectController {


    private final ProjectService projectService;
    private final UserService userService;


    public ProjectController(ProjectService projectService, UserService userService) {
        this.projectService = projectService;
        this.userService = userService;
    }


    @GetMapping("/create")
    public String createUser(Model model) {

        model.addAttribute("project", new ProjectDTO());

        model.addAttribute("managers", projectService.findAll());

        model.addAttribute("projects",projectService.findAll());

        return "/project/create";
    }


}
