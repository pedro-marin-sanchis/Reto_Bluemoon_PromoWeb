package com.uguinformatica.promoweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CompanyController {
    @GetMapping("/uguinformatica")
    public String getCompany() {
        return "company/company";
    }
}
