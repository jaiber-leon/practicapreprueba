package com.example.practica.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class AuditoriasEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nombre")
    private String nombre;
    @Column(name = "ente_de_control")
    private String enteDeControl;
    @Column(name = "fecha_de_inicio")
    private  Date fechaDeInicio;
    @Column(name = "fecha_de_finalizacion")
    private Date fechaDeFinalizacion;
}
