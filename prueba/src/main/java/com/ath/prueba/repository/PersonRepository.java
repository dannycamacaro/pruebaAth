package com.ath.prueba.repository;

import com.ath.prueba.model.PersonModel;
import org.springframework.data.repository.CrudRepository;

public interface PersonRepository extends CrudRepository<PersonModel,Long> {
}
