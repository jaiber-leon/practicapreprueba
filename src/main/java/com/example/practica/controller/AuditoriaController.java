package com.example.practica.controller;

import com.example.practica.entity.AuditoriasEntity;
import com.example.practica.service.impl.ImpAuditorioService;
import jakarta.persistence.GeneratedValue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/au")
public class AuditoriaController {
    @Autowired
    ImpAuditorioService impAuditorioService;

    @PostMapping("/guardar")
        public AuditoriasEntity guardar (@RequestBody AuditoriasEntity auditoriasEntity){
            return impAuditorioService.crearAudi(auditoriasEntity);

    }

    @GetMapping("/traer")
        public List<AuditoriasEntity> traer(){
        return impAuditorioService.buscarregistros();
    }

    @PutMapping("/actualizar")
    public void actualizar (AuditoriasEntity auditoriasEntity){
        impAuditorioService.actualizar(auditoriasEntity);
    }
}
