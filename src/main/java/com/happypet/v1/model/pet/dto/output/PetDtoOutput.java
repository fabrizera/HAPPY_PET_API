package com.happypet.v1.model.pet.dto.output;

import com.happypet.v1.model.pet.Pet;
import lombok.Data;

@Data
public class PetDtoOutput {
    private Integer id;
    private String name;
    private String typePet;
    private String species;
    private String cor;
    private Integer age;
    private String owner;
    private String lastVisit;
    private String obs;
    private String fone;
    private String address;
    private String district;
    private String city;

    public PetDtoOutput(Pet pet) {
        this.id = pet.getId();
        this.name = pet.getName();
        this.typePet = pet.getTypePet();
        this.species = pet.getSpecies();
        this.cor = pet.getCor();
        this.age = pet.getAge();
        this.owner = pet.getOwner();
        this.lastVisit = pet.getLastVisit();
        this.obs = pet.getObs();
        this.fone = pet.getFone();
        this.address = pet.getAddress();
        this.district = pet.getDistrict();
        this.city = pet.getCity();
    }

}
