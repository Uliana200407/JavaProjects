package ua.andreieva.uliana.springboot.controllers;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;
import ua.andreieva.uliana.springboot.service.MainService;
import ua.andreieva.uliana.springboot.service.OverallInf;

import java.util.ArrayList;

@RestController
@RequestMapping("/")
public class Controller {


    @Autowired
    private MainService service;

    @PutMapping(value = "/register-compilation-time")
    public void addService(@RequestBody OverallInf request) {
        service.putData (request );
    }

    @GetMapping(value ="/register-compilation-time")
    public String getService() {
        return service.getData ();
    }


    @GetMapping(value ="/failed-results")
    public ArrayList < String > getFailedRecords() {
        return service.getFailedRecords ();
    }

    @GetMapping(value ="/long-compilation")
    public ArrayList < String > getLongCompilation() {
        return service.getLongCompilation ();
    }

    @GetMapping(value ="/normal-compilation")
    public ArrayList < String > getNormalCompilation() {
        return service.getNormalCompilation ();
    }

    @GetMapping(value ="/projects")
    public ArrayList<String> getRecords(){
        return service.getRecords ();
    }

    @GetMapping(value ="/success-result")
    public ArrayList <String> getSuccessRecords(){
        return service.getSuccessRecords ();
    }
}

