package com.tornikeperadze.petclinic.repositories;

import com.tornikeperadze.petclinic.model.PetType;
import org.springframework.data.repository.CrudRepository;

public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
