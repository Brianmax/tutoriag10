package com.tutoria.tutoria.request;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class EditorialRequest {
    private String ruc;
    private String nombre;
    private String descripcion;
    private Date fechaFundacion;
}
