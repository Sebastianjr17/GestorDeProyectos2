package com.example.GestorDeProyectos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.GestorDeProyectos.variables.Idea;


public interface IdeaRepository extends JpaRepository<Idea, Long>{

}
