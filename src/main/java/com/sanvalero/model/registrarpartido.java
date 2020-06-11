package com.sanvalero.model;

import java.time.LocalDate;

public class registrarpartido extends partido {
	private String idpartido;
	private LocalDate fechapartido;
	private String arbitro;
	private int resultado;
	private String observaciones;
	private String lugar;
	
	
	public registrarpartido(String idCalendario, String idEquipo1, String equipo2, String lugar, LocalDate fecha,
			String idpartido, String idequipo12, String idequipo2, String lugar2, LocalDate fecha2, String idpartido2,
			LocalDate fechapartido, String arbitro, int resultado, String observaciones, String lugar3) {
		super(idCalendario, idEquipo1, equipo2, lugar, fecha, idpartido, idequipo12, idequipo2, lugar2, fecha2);
		idpartido = idpartido2;
		this.fechapartido = fechapartido;
		this.arbitro = arbitro;
		this.resultado = resultado;
		this.observaciones = observaciones;
		lugar = lugar3;
	}


	public String getIdpartido() {
		return idpartido;
	}


	public void setIdpartido(String idpartido) {
		this.idpartido = idpartido;
	}


	public LocalDate getFechapartido() {
		return fechapartido;
	}


	public void setFechapartido(LocalDate fechapartido) {
		this.fechapartido = fechapartido;
	}


	public String getArbitro() {
		return arbitro;
	}


	public void setArbitro(String arbitro) {
		this.arbitro = arbitro;
	}


	public int getResultado() {
		return resultado;
	}


	public void setResultado(int resultado) {
		this.resultado = resultado;
	}


	public String getObservaciones() {
		return observaciones;
	}


	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}


	public String getLugar() {
		return lugar;
	}


	public void setLugar(String lugar) {
		this.lugar = lugar;
	}
	
	
}
