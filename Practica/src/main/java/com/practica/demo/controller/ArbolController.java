package com.practica.demo.controller;

import com.practica.demo.service.ArbolService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Slf4j
@RequestMapping("/arbol") 
public class ArbolController {
    
    @Autowired
    private ArbolService arbolService;

    @GetMapping("/listado")
    public String inicio(Model model) {
        var arboles = arbolService.getArboles(false);
        model.addAttribute("arboles", arboles);
        model.addAttribute("totalArboles", arboles.size());
        return "arbol/listado";  
    }
}