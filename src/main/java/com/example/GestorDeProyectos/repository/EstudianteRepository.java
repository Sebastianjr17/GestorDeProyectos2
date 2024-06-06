package com.example.GestorDeProyectos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.GestorDeProyectos.variables.Estudiante;


public interface EstudianteRepository extends JpaRepository<Estudiante, Long>{
    Estudiante findByCorreoAndContrasena(String correo, String contrasena);

}