package com.techzone.techzone.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class InicioController {

    @GetMapping("/")
    public String inicio(Model model) {
        model.addAttribute("message", "¡Bienvenido a TechZone!");
        return "index";
    }
}
