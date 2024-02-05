package com.uguinformatica.promoweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LandingController {
    @GetMapping("/landing")
    public String getLanding() {
        return "/landing/landing";
    }
}
