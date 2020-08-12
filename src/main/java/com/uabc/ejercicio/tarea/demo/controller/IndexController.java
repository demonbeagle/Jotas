package com.uabc.ejercicio.tarea.demo.controller;


import com.uabc.ejercicio.tarea.demo.model.Jabali;
import com.uabc.ejercicio.tarea.demo.services.JabaliService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;

@Controller
public class IndexController {

    @Autowired JabaliService service;
    @GetMapping({"/","/app"})
    public String indecs(){return "index";}

    @GetMapping("/jabalis")
    public String mostrarJabalis(Model model){

        Jabali jabali = new Jabali();
        jabali.setJabaliName("Jaime");
        jabali.setJabaliId(150);
        jabali.setJabaliBreed("Japonés");
        service.add(jabali);
        List<Jabali> jabalis = service.todos("Jaime");
        model.addAttribute("jabalis",jabalis);
        return "jabalies";
    }



}
