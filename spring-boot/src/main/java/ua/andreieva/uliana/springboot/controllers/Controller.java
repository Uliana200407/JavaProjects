package ua.andreieva.uliana.springboot.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ua.andreieva.uliana.springboot.service.MainService;

@RestController
@RequestMapping("/register-compilation-time")
public class Controller {

    @Autowired
    private MainService service;

    @PutMapping
    public void addService(String project,String timestamp,String compilationTime,String result) {
        service.putData (  project, timestamp, compilationTime, result );
    }
    @GetMapping
    public String getService(){
       return service.getData ();
    }
}
