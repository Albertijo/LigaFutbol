package com.sanvalero.model;

import java.time.LocalDate;

public class equipo extends usuario {
		
	private String patrocinador;
	private String camiseta1;
	private String camiseta2;
	private String categoria;
	
	
	public equipo(String idUsuario, String nombre, String apellidos, String direccion, int telefono,
			LocalDate fechaNaciminento, String patrocinador, String camiseta1, String camiseta2, String categoria) {
		super(idUsuario, nombre, apellidos, direccion, telefono, fechaNaciminento);
		this.patrocinador = patrocinador;
		this.camiseta1 = camiseta1;
		this.camiseta2 = camiseta2;
		this.categoria = categoria;
	}


	public String getPatrocinador() {
		return patrocinador;
	}


	public void setPatrocinador(String patrocinador) {
		this.patrocinador = patrocinador;
	}


	public String getCamiseta1() {
		return camiseta1;
	}


	public void setCamiseta1(String camiseta1) {
		this.camiseta1 = camiseta1;
	}


	public String getCamiseta2() {
		return camiseta2;
	}


	public void setCamiseta2(String camiseta2) {
		this.camiseta2 = camiseta2;
	}


	public String getCategoria() {
		return categoria;
	}


	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	
	
	
}
	
	