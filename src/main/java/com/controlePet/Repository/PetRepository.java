package com.controlePet.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.controlePet.Entity.Pet;

public interface PetRepository extends JpaRepository<Pet, Long> {

}
