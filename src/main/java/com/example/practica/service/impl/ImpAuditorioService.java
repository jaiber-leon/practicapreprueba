package com.example.practica.service.impl;

import com.example.practica.entity.AuditoriasEntity;
import com.example.practica.enums.Estado;
import com.example.practica.repository.IAuditoriaRepository;
import com.example.practica.service.IAuditorioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class ImpAuditorioService implements IAuditorioService {

    @Autowired
    IAuditoriaRepository iAuditoriaRepository;
    @Override
    public AuditoriasEntity crearAudi(AuditoriasEntity auditoriasEntity) {
        return iAuditoriaRepository.save(auditoriasEntity);
    }

    @Override
    public List<AuditoriasEntity> buscarregistros() {
        List<AuditoriasEntity> auditoriasEntities = iAuditoriaRepository.findAll();
        return auditoriasEntities;
    }

    @Override
    public void actualizar(AuditoriasEntity auditoriasEntityactual) {

            AuditoriasEntity auditoriasEntityupda = new AuditoriasEntity();
            auditoriasEntityupda.setId(auditoriasEntityactual.getId());
            auditoriasEntityupda.setNombre(auditoriasEntityactual.getNombre());
            auditoriasEntityupda.setEnteDeControl(auditoriasEntityactual.getEnteDeControl());
            auditoriasEntityupda.setFechaDeInicio(auditoriasEntityactual.getFechaDeInicio());
            auditoriasEntityupda.setFechaDeFinalizacion(auditoriasEntityactual.getFechaDeFinalizacion());
            auditoriasEntityupda.setEstado(auditoriasEntityactual.getEstado());
            if (auditoriasEntityupda.getEstado() == Estado.FINALIZADA){
                auditoriasEntityupda = auditoriasEntityactual;
            }

    }
}
