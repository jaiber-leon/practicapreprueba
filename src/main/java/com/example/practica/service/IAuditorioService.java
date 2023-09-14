package com.example.practica.service;

import com.example.practica.entity.AuditoriasEntity;

import java.util.List;

public interface IAuditorioService {

     AuditoriasEntity crearAudi (AuditoriasEntity auditoriasEntity);

     List<AuditoriasEntity> buscarregistros ();

     void actualizar (AuditoriasEntity auditoriasEntity);
}
