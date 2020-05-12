package com.dca.sio.app.masterdata.service.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "unidad_medida")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UnidadMedida implements Serializable {

    private static final long serialVersionUID = -2869073074586724558L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "codUnidadMedida", unique = true, nullable = false)
    private String codUnidadMedida;

    @Column(name = "descripcion", unique = true, nullable = false)
    private String descripcion;

}
