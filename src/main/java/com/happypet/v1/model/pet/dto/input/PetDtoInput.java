package com.happypet.v1.model.pet.dto.input;

import com.happypet.v1.model.pet.Pet;
import lombok.Data;

@Data
public class PetDtoInput {

    private String name;
    private String typePet;
    private String species;
    private String cor;
    private Integer age;
    private String owner;
    private String obs;
    private String fone;
    private String address;
    private String district;
    private String city;

    public Pet build() {
        Pet pet = new Pet();
        pet.setName(this.name);
        pet.setTypePet(this.typePet);
        pet.setSpecies(this.species);
        pet.setCor(this.cor);
        pet.setAge(this.age);
        pet.setOwner(this.owner);
        pet.setObs(this.obs);
        pet.setFone(this.fone);
        pet.setAddress(this.address);
        pet.setDistrict(this.district);
        pet.setCity(this.city);
        return pet;
    }


}
