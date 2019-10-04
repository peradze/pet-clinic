package com.tornikeperadze.petclinic.repositories;

import com.tornikeperadze.petclinic.model.Speciality;
import org.springframework.data.repository.CrudRepository;

public interface SpecialityRepository extends CrudRepository<Speciality, Long> {
}
