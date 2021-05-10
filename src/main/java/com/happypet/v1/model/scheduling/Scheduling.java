/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.happypet.v1.model.scheduling;

import java.io.Serializable;
import java.util.Date;
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
@Table(name = "scheduling")
public class Scheduling implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "id-pet")
    private int idPet;
    @Basic(optional = false)
    @Column(name = "date")
    @Temporal(TemporalType.DATE)
    private Date date;
    @Basic(optional = false)
    @Column(name = "hour")
    @Temporal(TemporalType.TIME)
    private Date hour;
    @Basic(optional = false)
    @Column(name = "type_service")
    private int typeService;
    @Basic(optional = false)
    @Column(name = "professional")
    private String professional;
    @Basic(optional = false)
    @Column(name = "status")
    private String status;
    @Basic(optional = false)
    @Column(name = "value")
    private float value;
    @Basic(optional = false)
    @Column(name = "dt_create")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCreate;
    @Basic(optional = false)
    @Column(name = "user_create")
    private int userCreate;

    public Scheduling(Integer id) {
        this.id = id;
    }

}
