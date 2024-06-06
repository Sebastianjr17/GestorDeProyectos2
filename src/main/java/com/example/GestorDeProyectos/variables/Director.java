package com.example.GestorDeProyectos.variables;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "directores")
public class Director {

	@Id
	private Long id;
	private String nombre;
	private String apellido;
	private String correo;
	private String contrasena;

	@OneToMany(mappedBy = "idDirector")
	private List<Trabajo> trabajos;

	public Director() {
		super();
	}

	public Director(Long id, String nombre, String apellido, String correo, String contrasena) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.correo = correo;
		this.contrasena = contrasena;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getContrasena() {
		return contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

	public List<Trabajo> getTrabajos() {
		return trabajos;
	}

	public void setTrabajos(List<Trabajo> trabajos) {
		this.trabajos = trabajos;
	}

	public String toString() {
		return "Director [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", correo=" + correo
				+ ", contrasena=" + contrasena + ", trabajo=" + trabajos + "]";
	}
}
