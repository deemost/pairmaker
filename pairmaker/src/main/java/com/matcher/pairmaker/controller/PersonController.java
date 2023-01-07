package com.matcher.pairmaker.controller;

import com.matcher.pairmaker.model.Person;
import com.matcher.pairmaker.service.PersonService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class PersonController {
    private PersonService service;

    public PersonController(PersonService service) {
        this.service = service;
    }
//
//    @PostMapping
//    public Person createPerson(){
//        service.createPerson();
//    }
}
