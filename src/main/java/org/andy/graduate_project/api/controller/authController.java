package org.andy.graduate_project.api.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class authController {

    @GetMapping("/auth/signin")
    public String signin() {
        return "auth/signin";
    }
}