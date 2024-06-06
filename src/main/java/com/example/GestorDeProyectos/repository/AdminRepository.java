package com.example.GestorDeProyectos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.GestorDeProyectos.variables.Admin;

public interface AdminRepository extends JpaRepository<Admin, Long> {
	
}