package com.tienda.domain;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="categoria")
public class Categoria {
    private Long idCategoria;
    private String descripcion;
    private String rutaImagen;
    private boolean activo;
    
}

/*
  id_categoria INT NOT NULL AUTO_INCREMENT,
  descripcion VARCHAR(30) NOT NULL,
  ruta_imagen varchar(1024),
  activo bool,
PRIMARY KEY (id_categoria)
*/