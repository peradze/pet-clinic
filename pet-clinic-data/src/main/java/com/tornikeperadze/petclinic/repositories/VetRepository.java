package com.tornikeperadze.petclinic.repositories;

import com.tornikeperadze.petclinic.model.Vet;
import org.springframework.data.repository.CrudRepository;

public interface VetRepository extends CrudRepository<Vet, Long> {
}
