package com.ath.prueba.controller;

import com.ath.prueba.model.PersonModel;
import com.ath.prueba.service.PersonServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Optional;

@RestController
@RequestMapping(path = "/person")
public class PersonController {

    @Autowired
    PersonServices personServices;

    @GetMapping(path = "/{id}")
    public Optional<PersonModel> getById(@PathVariable(value = "id") Long id) {
        return personServices.getPersonById(id);
    }

    @PostMapping(path = "/create")
    @ResponseBody
    public Iterable<PersonModel> insertEmployee(@Valid @RequestBody PersonModel employeeEntity) {
        personServices.newPerson(employeeEntity);
        return personServices.getAllPerson();
    }

    @GetMapping
    public Iterable<PersonModel> getAllEmployees() {
        return personServices.getAllPerson();
    }
}
