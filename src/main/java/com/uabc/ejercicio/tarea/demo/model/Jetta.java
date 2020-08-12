package com.uabc.ejercicio.tarea.demo.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "jettas")
public class Jetta implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)

    @Column(name="jetta_id")
    private long jettaId;
    @Column(name="jetta_color")
    private String jettaColor;
    @Column(name="jetta_year")
    private String jettaYear;
}
