package com.sanvalero.model;

import java.time.LocalDate;

public class partido extends calendario {

	private String idpartido;
	private String idequipo1;
	private String idequipo2;
	private String lugar;
	private LocalDate fecha;
	
	public partido(String idCalendario, String idEquipo1, String equipo2, String lugar, LocalDate fecha,
			String idpartido, String idequipo12, String idequipo2, String lugar2, LocalDate fecha2) {
		super(idCalendario, idEquipo1, equipo2, lugar, fecha);
		this.idpartido = idpartido;
		idequipo1 = idequipo12;
		this.idequipo2 = idequipo2;
		lugar = lugar2;
		fecha = fecha2;
	}

	public String getIdpartido() {
		return idpartido;
	}

	public void setIdpartido(String idpartido) {
		this.idpartido = idpartido;
	}

	public String getIdequipo1() {
		return idequipo1;
	}

	public void setIdequipo1(String idequipo1) {
		this.idequipo1 = idequipo1;
	}

	public String getIdequipo2() {
		return idequipo2;
	}

	public void setIdequipo2(String idequipo2) {
		this.idequipo2 = idequipo2;
	}

	public String getLugar() {
		return lugar;
	}

	public void setLugar(String lugar) {
		this.lugar = lugar;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
	
	
}
