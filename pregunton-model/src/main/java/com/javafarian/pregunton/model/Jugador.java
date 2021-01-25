package com.javafarian.pregunton.model;

import com.javafarian.pregunton.enums.Rol;

public class Jugador {
	private Integer id;
	private Rol rol;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Rol getRol() {
		return rol;
	}

	public void setRol(Rol rol) {
		this.rol = rol;
	}
	
}
