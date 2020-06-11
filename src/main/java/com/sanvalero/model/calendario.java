package com.sanvalero.model;

import java.time.LocalDate;

public class calendario {

	private String idCalendario;
	private String idEquipo1;
	private String Equipo2;
	private String Lugar;
	private LocalDate Fecha;
	
	
	
	public calendario(String idCalendario, String idEquipo1, String equipo2, String lugar, LocalDate fecha) {
		super();
		this.idCalendario = idCalendario;
		this.idEquipo1 = idEquipo1;
		Equipo2 = equipo2;
		Lugar = lugar;
		Fecha = fecha;
	}
	public String getIdCalendario() {
		return idCalendario;
	}
	public void setIdCalendario(String idCalendario) {
		this.idCalendario = idCalendario;
	}
	public String getIdEquipo1() {
		return idEquipo1;
	}
	public void setIdEquipo1(String idEquipo1) {
		this.idEquipo1 = idEquipo1;
	}
	public String getEquipo2() {
		return Equipo2;
	}
	public void setEquipo2(String equipo2) {
		Equipo2 = equipo2;
	}
	public String getLugar() {
		return Lugar;
	}
	public void setLugar(String lugar) {
		Lugar = lugar;
	}
	public LocalDate getFecha() {
		return Fecha;
	}
	public void setFecha(LocalDate fecha) {
		Fecha = fecha;
	}
	
}
