package com.example.practica.repository;

import com.example.practica.entity.AuditoriasEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface IAuditoriaRepository extends JpaRepository<AuditoriasEntity, Long> {
    @Query(value = "Select * FROM auditorias a WHERE a.nombre = :nombre" ,nativeQuery = true)
    public  AuditoriasEntity buscarPorNombre (@Param("nombre") String nombre);
}
