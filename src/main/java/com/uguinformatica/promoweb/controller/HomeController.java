package com.uguinformatica.promoweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping({"", "/"})
    public String getLanding() {
        return "redirect:/app";
    }
}
