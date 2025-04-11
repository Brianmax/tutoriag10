package com.tutoria.tutoria.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@Table(name = "libro")
public class LibroEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idLibro;
    private String titulo;
    private int edicion;
    private boolean estado;
    private Date fechaPublicacion;
    private Date fechaCreacion;
    private Date fechaModificacion;

    @ManyToOne
    @JoinColumn(name = "id_editorial")
    private EditorialEntity editorial;

    @ManyToMany(mappedBy = "libros")
    private List<AutorEntity> autores;
}
