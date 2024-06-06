package com.example.GestorDeProyectos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import com.example.GestorDeProyectos.variables.Coordinador;


public interface CoordinadorRepository extends JpaRepository<Coordinador, Long>{
    Optional<Coordinador> findByCorreoAndContrasena(String correo, String contrasena);
}