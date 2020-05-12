package com.dca.sio.app.masterdata.service.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "tipo_aforo")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TipoAforo implements Serializable {

    private static final long serialVersionUID = -2869073074586724558L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "codTipoaforo", unique = true, nullable = false)
    private String codTipoaforo;

    @Column(name = "descripcion", unique = true, nullable = false)
    private String descripcion;

}
