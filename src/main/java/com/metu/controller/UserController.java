package com.metu.controller;

import com.metu.dto.UserDTO;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {

    @GetMapping("/create")
    public String createUser(Model model) {
        model.addAttribute("user", new UserDTO("John", "Kesy", "john@metu.edu.com", "Abc1", true, "7459684532", managerRole, Gender.MALE));
       // model.addAttribute("roles", );
        return "user/create";
    }

}
