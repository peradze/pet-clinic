package com.tornikeperadze.petclinic.repositories;

import com.tornikeperadze.petclinic.model.Owner;
import org.springframework.data.repository.CrudRepository;

public interface OwnerRepository extends CrudRepository<Owner, Long> {
}
