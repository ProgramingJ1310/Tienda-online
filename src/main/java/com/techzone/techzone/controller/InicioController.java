
package com.techzone.techzone.controller;

import com.techzone.techzone.model.Producto;
import com.techzone.techzone.service.ProductoService;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class InicioController {

    private final ProductoService productoService;

    public InicioController(ProductoService productoService) {
        this.productoService = productoService;
    }

    @GetMapping("/")
    public String inicio(Model model) {

        model.addAttribute(
                "mensaje",
                "¡Bienvenida a nuestra tienda de tecnología!");

        model.addAttribute(
                "productos",
                productoService.listarProductos());

        return "index";
    }

    @GetMapping("/productos/nuevo")
    public String mostrarFormulario(Model model) {

        model.addAttribute("producto", new Producto());

        return "formulario-producto";
    }

    @PostMapping("/productos/guardar")
    public String guardarProducto(
            @ModelAttribute("producto") Producto producto) {

        productoService.guardarProducto(producto);

        return "redirect:/";
    }
}
