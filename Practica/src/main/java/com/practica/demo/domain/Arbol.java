package com.practica.demo.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;

@Data
@Entity
@Table(name="arbol")
public class Arbol implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_categoria")
    private Long id_categoria;
    
    @Column(name="descripcion")
    private String descripcion;
    
    @Column(name="ruta_imagen")
    private String rutaImagen;
    
    @Column(name="activo")
    private boolean activo;

    public Arbol() {
    }

    public Arbol(String descripcion, boolean activo) {
        this.descripcion = descripcion;
        this.activo = activo;
    }
}