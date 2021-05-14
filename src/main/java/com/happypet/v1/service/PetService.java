package com.happypet.v1.service;

import com.happypet.v1.model.pet.Pet;
import com.happypet.v1.model.pet.dto.input.PetDtoInput;
import com.happypet.v1.model.pet.dto.output.PetDtoOutput;
import com.happypet.v1.repository.PetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PetService {

    @Autowired
    private PetRepository petRepository;

    public List<PetDtoOutput> findAllByNameLike(String name) {
        List<Pet> pets = petRepository.findAllByNameLike(name);
        return pets.stream().map((pet) -> new PetDtoOutput(pet)).collect(Collectors.toList());
    }

    public PetDtoOutput save(PetDtoInput petDtoInput) {
        return new PetDtoOutput(petRepository.save(petDtoInput.build()));
    }

    public PetDtoOutput update(Integer id, PetDtoInput petDtoInput) {
        Pet petExisting = petRepository.findById(id).orElseThrow(() -> new RuntimeException("Pet {" + id + "} não encontrado na base de dados"));
        Pet petupdate = petDtoInput.build();
        petupdate.setId(petExisting.getId());
        return new PetDtoOutput(petRepository.save(petupdate));
    }

    public void delete(Integer id) {
        petRepository.deleteById(id);
    }

}
