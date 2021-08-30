package com.example.SafetyNey.controller;

import com.example.SafetyNey.service.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

public class PersonsController {
    @RestController
    public class PersonsController {

        private final PersonService personService;

        PersonsController(PersonService personService) {
            this.personService = personService;
        }

        //Get an email list
        @RequestMapping(value = "communityEmail", method = RequestMethod.GET)
        public List<String> listeEmails(@RequestParam(name = "city") String city) {

            return this.personService.findAllEmailsByCity(city);

        }
    }


}
