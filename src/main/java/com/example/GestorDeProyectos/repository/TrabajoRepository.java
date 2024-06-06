package com.example.GestorDeProyectos.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.GestorDeProyectos.variables.Director;
import com.example.GestorDeProyectos.variables.Estudiante;
import com.example.GestorDeProyectos.variables.Trabajo;


public interface TrabajoRepository extends JpaRepository<Trabajo, Long>{
	List<Trabajo> findByDisponibleTrue();
	List<Trabajo> findByDisponibleFalse();
	List<Trabajo> findByIdDirector(Director director);
    Trabajo findByIdEstudiante(Estudiante estudiante);
    Trabajo findByIdEstudianteId(Long idEstudiante);
}
