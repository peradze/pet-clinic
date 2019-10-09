package com.tornikeperadze.petclinic.controllers;

import com.tornikeperadze.petclinic.model.Owner;
import com.tornikeperadze.petclinic.model.Pet;
import com.tornikeperadze.petclinic.model.PetType;
import com.tornikeperadze.petclinic.services.OwnerService;
import com.tornikeperadze.petclinic.services.PetService;
import com.tornikeperadze.petclinic.services.PetTypeService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import java.util.HashSet;
import java.util.Set;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@ExtendWith(MockitoExtension.class)
class PetControllerTest {

    @Mock
    PetService petService;
    @Mock
    OwnerService ownerService;
    @Mock
    PetTypeService petTypeService;

    @InjectMocks
    PetController controller;

    Pet pets;
    Owner owner;
    Set<PetType> petTypes;

    MockMvc mockMvc;

    @BeforeEach
    void setUp() {
        owner =  Owner.builder().id(1L).build();
        pets = Pet.builder().id(1L).owner(owner).build();
        petTypes = new HashSet<>();
        petTypes.add(PetType.builder().id(1L).build());
        petTypes.add(PetType.builder().id(2L).build());

        mockMvc = MockMvcBuilders.standaloneSetup(controller).build();
    }

    @Test
    void initCreationForm() throws Exception {
        when(ownerService.findById(any())).thenReturn(Owner.builder().id(1L).build());

        mockMvc.perform(get("/owners/1/pets/new"))
                .andExpect(status().isOk())
                .andExpect(model().attributeExists("pet"))
                .andExpect(view().name("pets/createOrUpdatePetForm"));
    }

    @Test
    void processCreationForm() {
    }

    @Test
    void initUpdateForm() {
    }

    @Test
    void processUpdateForm() {
    }
}