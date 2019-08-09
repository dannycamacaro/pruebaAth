package com.ath.prueba.service;

import com.ath.prueba.controller.PersonController;
import com.ath.prueba.model.PersonModel;
import com.ath.prueba.repository.PersonRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public class PersonServices {

    private static final Logger LOGGER = LoggerFactory.getLogger(PersonController.class);

    @Autowired
    PersonRepository personRepository;

    public Optional<PersonModel> getPersonById(Long id) {
        return personRepository.findById(id);
    }

    public PersonModel newPerson(PersonModel person) {
            return personRepository.save(person);
    }

    public Iterable<PersonModel> getAllPerson() {
        return personRepository.findAll();
    }
}
