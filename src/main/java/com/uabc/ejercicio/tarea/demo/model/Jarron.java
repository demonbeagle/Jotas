package com.uabc.ejercicio.tarea.demo.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "jarrones")
public class Jarron implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)

    @Column(name="jarron_id")
    private long jarrond;
    @Column(name="jarron_precio")
    private double jarronPrecio;
    @Column(name="jarron_existencia")
    private String jarronExist;
}
