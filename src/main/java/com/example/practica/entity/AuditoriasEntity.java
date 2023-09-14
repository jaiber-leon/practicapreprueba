package com.example.practica.entity;

import com.example.practica.enums.Estado;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "auditoria")
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
    private LocalDateTime fechaDeFinalizacion;

    @Enumerated(EnumType.STRING)
    private Estado estado;
}
