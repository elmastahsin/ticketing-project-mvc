package com.metu.controller;

import com.metu.dto.UserDTO;
import com.metu.service.RoleService;
import com.metu.service.UserService;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/user")
public class UserController {

    private final RoleService roleService;
    private final UserService userService;

    public UserController(RoleService roleService, UserService userService) {
        this.roleService = roleService;
        this.userService = userService;
    }

    @GetMapping("/create")
    public String createUser(Model model) {

        model.addAttribute("user", new UserDTO());

        model.addAttribute("roles", roleService.findAll());

        model.addAttribute("users", userService.findAll());

        return "/user/create";
    }

    @PostMapping("/create")
    public String insertUser(@ModelAttribute("user") UserDTO user) {

        userService.save(user);

        return "redirect:/user/create";

    }

    @GetMapping("/update/{username}")

    public String updateUser(@PathVariable("username") String username, Model model) {
        // user object
        model.addAttribute("user", userService.findById(username));
        //{roles}
        model.addAttribute("roles",roleService.findAll());

        //{users}
        model.addAttribute("users",userService.findAll());
        return "user/update";
    }
}
