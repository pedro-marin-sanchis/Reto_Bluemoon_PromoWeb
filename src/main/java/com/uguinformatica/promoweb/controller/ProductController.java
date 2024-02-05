package com.uguinformatica.promoweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProductController {
    @GetMapping("/app")
    public String getBluemoon() {
        return "/product/product";
    }
}
