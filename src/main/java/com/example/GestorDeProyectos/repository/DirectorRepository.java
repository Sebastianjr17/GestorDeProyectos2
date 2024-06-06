package com.example.GestorDeProyectos.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.GestorDeProyectos.variables.Director;


public interface DirectorRepository extends JpaRepository<Director, Long>{
    Optional<Director> findByCorreoAndContrasena(String correo, String contrasena);

}