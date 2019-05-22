package co.com.beans;

import java.util.ArrayList;

public class Servicio {
	private String codigo;
	private String nombre;
	private ArrayList<Profesional> profesional;
	
	public Servicio(String codigo, String nombre, ArrayList<Profesional> profesional) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.profesional = profesional;
	}
	
	public Servicio() {
		
	}
	
	public String getCodigo() {
		return codigo;
	}
	
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList<Profesional> getProfesional() {
		return profesional;
	}

	public void setProfesional(ArrayList<Profesional> profesional) {
		this.profesional = profesional;
	}
	
}
