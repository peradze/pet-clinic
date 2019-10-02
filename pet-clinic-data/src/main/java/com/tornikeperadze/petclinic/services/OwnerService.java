package com.tornikeperadze.petclinic.services;

import com.tornikeperadze.petclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {
    Owner findByLastName(String lastName);
}
