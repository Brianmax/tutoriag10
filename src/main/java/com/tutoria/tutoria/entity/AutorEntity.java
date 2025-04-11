package com.tutoria.tutoria.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

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

    @ManyToMany
    @JoinTable(name = "autor_libro",
    joinColumns = @JoinColumn(name = "autor"),
    inverseJoinColumns = @JoinColumn(name = "libro"))
    private List<LibroEntity> libros;
}
