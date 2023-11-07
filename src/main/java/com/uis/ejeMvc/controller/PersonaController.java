package com.uis.ejeMvc.controller;

import com.uis.ejeMvc.model.Persona;
import com.uis.ejeMvc.service.PersonaServiceInter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping
public class PersonaController {
    @Autowired
    private PersonaServiceInter personaServiceInter;
    @GetMapping("/listar")
    public String listar(Model model){
        List<Persona>personas = personaServiceInter.listar();
        model.addAttribute("personas", personas);
        return "index";
    }
}
