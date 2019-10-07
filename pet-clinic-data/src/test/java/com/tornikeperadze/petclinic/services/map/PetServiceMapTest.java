package com.tornikeperadze.petclinic.services.map;

import com.tornikeperadze.petclinic.model.Pet;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class PetServiceMapTest {

    private PetServiceMap petServiceMap;

    private final Long petId = 1L;

    @BeforeEach
    void setUp() {
        petServiceMap = new PetServiceMap();
        petServiceMap.save(Pet.builder().id(petId).build());
    }

    @Test
    void findAll() {
        Set<Pet> pets = petServiceMap.findAll();

        assertEquals(1, pets.size());
    }

    @Test
    void deleteById() {
        petServiceMap.deleteById(petId);

        assertEquals(0, petServiceMap.findAll().size());
    }

    @Test
    void delete() {
        petServiceMap.delete(petServiceMap.findById(petId));

        assertEquals(0, petServiceMap.findAll().size());
    }

    @Test
    void saveExistingId() {
        Long id = 2L;
        Pet savedPet = petServiceMap.save(Pet.builder().id(id).build());

        assertEquals(id, savedPet.getId());
    }

    @Test
    void saveNoId() {
        Pet savedPet = petServiceMap.save(Pet.builder().build());

        assertNotNull(savedPet);
    }

    @Test
    void findById() {
        Pet pet = petServiceMap.findById(petId);

        assertEquals(petId, pet.getId());
    }
}