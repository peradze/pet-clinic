package com.tornikeperadze.petclinic.repositories;

import com.tornikeperadze.petclinic.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet, Long> {
}
