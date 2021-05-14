package com.happypet.v1.repository;

import com.happypet.v1.model.pet.Pet;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PetRepository extends JpaRepository<Pet, Integer> {

    List<Pet> findAllByNameLike(String name);

}
