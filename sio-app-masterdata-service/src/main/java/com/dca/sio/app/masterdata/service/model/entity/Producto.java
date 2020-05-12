package com.dca.sio.app.masterdata.service.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "productos")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Producto implements Serializable {

    private static final long serialVersionUID = -2869073074586724558L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "codproducto", unique = true, nullable = false)
    private String codProducto;

    @Column(name = "descripcion", unique = true, nullable = false)
    private String descripcion;

}
