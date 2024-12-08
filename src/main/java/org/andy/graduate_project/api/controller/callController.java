package org.andy.graduate_project.api.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class callController {

    @GetMapping("/call")
    public String call() {
        return "call";
    }
}