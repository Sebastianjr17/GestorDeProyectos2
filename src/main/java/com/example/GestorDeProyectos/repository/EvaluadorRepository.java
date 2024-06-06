package com.example.GestorDeProyectos.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.GestorDeProyectos.variables.Evaluador;


public interface EvaluadorRepository extends JpaRepository<Evaluador, Long>{
    Optional<Evaluador> findByCorreoAndContrasena(String correo, String contrasena);
}
