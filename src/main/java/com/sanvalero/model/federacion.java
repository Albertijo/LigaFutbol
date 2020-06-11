package com.sanvalero.model;

import java.time.LocalDate;

public class federacion {

	private String idEmpleado;
	private String cargo;
	private LocalDate fechaincorporacion;
	
	public federacion(String idEmpleado, String cargo, LocalDate fechaincorporacion) {
		super();
		this.idEmpleado = idEmpleado;
		this.cargo = cargo;
		this.fechaincorporacion = fechaincorporacion;
	}

	public String getIdEmpleado() {
		return idEmpleado;
	}

	public void setIdEmpleado(String idEmpleado) {
		this.idEmpleado = idEmpleado;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public LocalDate getFechaincorporacion() {
		return fechaincorporacion;
	}

	public void setFechaincorporacion(LocalDate fechaincorporacion) {
		this.fechaincorporacion = fechaincorporacion;
	}
	
	
	
}
