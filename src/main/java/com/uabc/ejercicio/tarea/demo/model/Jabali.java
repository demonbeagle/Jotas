package com.uabc.ejercicio.tarea.demo.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "jabalies")
public class Jabali implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)

    @Column(name="jabali_id")
        private long jabaliId;
    @Column(name="jabali_name")
        private String jabaliName;
    @Column(name="jabali_breed")
        private String jabaliBreed;
}
