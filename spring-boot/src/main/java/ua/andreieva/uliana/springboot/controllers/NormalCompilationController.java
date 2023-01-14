package ua.andreieva.uliana.springboot.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ua.andreieva.uliana.springboot.service.MainService;

import java.util.ArrayList;

@RestController
@RequestMapping("/normal-compilation")
public class NormalCompilationController {

    @Autowired
    private MainService service;

    @GetMapping
    public ArrayList <String> getNormalCompilation(){
        return service.getNormalCompilation ();
    }
}
