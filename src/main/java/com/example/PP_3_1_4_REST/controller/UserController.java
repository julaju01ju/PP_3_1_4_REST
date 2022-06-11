package com.example.PP_3_1_4_REST.controller;

import com.example.PP_3_1_4_REST.model.User;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @GetMapping("/userPage")
    public String getCurrentUserInfo(Model model) {
        User user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        model.addAttribute("user", user);
        return "user";
    }

    @GetMapping("/index")
    public String getIndex(Model model) {
        User thisUser = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        model.addAttribute("thisUser", thisUser);
        return "index";
    }
}
