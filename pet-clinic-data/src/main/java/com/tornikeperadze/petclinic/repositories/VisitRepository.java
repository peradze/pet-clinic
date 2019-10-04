package com.tornikeperadze.petclinic.repositories;

import com.tornikeperadze.petclinic.model.Visit;
import org.springframework.data.repository.CrudRepository;

public interface VisitRepository extends CrudRepository<Visit, Long> {
}
