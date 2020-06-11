package com.sanvalero.model;

import java.time.LocalDate;

public class usuario {
	
	private String idUsuario;
	private String nombre;
	private String apellidos;
	private String direcciom;
	private int telefono;
	private LocalDate fechaNacimiento;
	
	public usuario(String idUsuario, String nombre, String apellidos, String direcciom, int telefono,
			LocalDate fechaNacimiento) {
		super();
		this.idUsuario = idUsuario;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.direcciom = direcciom;
		this.telefono = telefono;
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(String idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getDirecciom() {
		return direcciom;
	}

	public void setDirecciom(String direcciom) {
		this.direcciom = direcciom;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

}
	