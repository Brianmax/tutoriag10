package com.tutoria.tutoria.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.StringReader;
import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "editorial")
public class EditorialEntity {
    @Id
    private String ruc;
    private String nombre;
    private String descripcion;
    private boolean estado;
    private Date fechaFundacion;
    private Date fechaCreacion;
    private Date fechaModificacion;
}
