package com.javafarian.pregunton.enums;

public enum Rol {
	MASTER ("Master"),
	PREGUNTON ("Pregunton");
	
	private final String rol;

	Rol(String string) {
		this.rol = string;
	}

	public String getRol() {
		return rol;
	}
}
