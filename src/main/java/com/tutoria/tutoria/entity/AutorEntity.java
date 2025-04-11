package com.tutoria.tutoria.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Entity
@Getter
@Setter
@Table(name = "autor")
public class AutorEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idAutor;
    private String nombre;
    private String apellido;
    private String email;
    private boolean estado;
    private Date fechaCreacion;
    private Date fechaModificacion;
}
