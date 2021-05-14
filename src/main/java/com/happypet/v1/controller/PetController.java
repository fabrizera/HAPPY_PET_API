package com.happypet.v1.controller;

import com.happypet.v1.model.pet.dto.input.PetDtoInput;
import com.happypet.v1.service.PetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;

@RestController
@RequestMapping(value = "/api/v1/pet")
public class PetController {

    @Autowired
    private PetService petService;

    @GetMapping
    public ResponseEntity<?> findAllByNameLike(@RequestParam String name) {
        return new ResponseEntity(petService.findAllByNameLike(name), HttpStatus.OK);
    }

    @Transactional
    @PostMapping
    public ResponseEntity<?> save(@RequestBody PetDtoInput petDtoInput) {
        return new ResponseEntity(petService.save(petDtoInput), HttpStatus.CREATED);
    }

    @Transactional
    @PutMapping("/{id}")
    public ResponseEntity<?> update(@PathVariable Integer id, @RequestBody PetDtoInput petDtoInput) {
        return new ResponseEntity(petService.update(id, petDtoInput), HttpStatus.ACCEPTED);
    }

    @Transactional
    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Integer id) {
        petService.delete(id);
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }
}
