/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.happypet.v1.model.pet;

import java.io.Serializable;
import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 *
 * @author Fabricio
 */
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "pet")
public class Pet implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "name")
    private String name;
    @Basic(optional = false)
    @Column(name = "type_pet")
    private String typePet;
    @Basic(optional = false)
    @Column(name = "species")
    private String species;
    @Basic(optional = false)
    @Column(name = "cor")
    private String cor;
    @Basic(optional = false)
    @Column(name = "age")
    private int age;
    @Basic(optional = false)
    @Column(name = "owner")
    private String owner;
    @Basic(optional = false)
    @Column(name = "last_visit")
    private String lastVisit;
    @Basic(optional = false)
    @Column(name = "obs")
    private String obs;
    @Basic(optional = false)
    @Column(name = "fone")
    private String fone;
    @Basic(optional = false)
    @Column(name = "address")
    private String address;
    @Basic(optional = false)
    @Column(name = "district")
    private String district;
    @Basic(optional = false)
    @Column(name = "city")
    private String city;

    public Pet(Integer id) {
        this.id = id;
    }

}
