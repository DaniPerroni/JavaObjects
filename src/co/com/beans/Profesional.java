package co.com.beans;

public class Profesional extends Persona {
	private String tipoProfesion;
	
	public Profesional(String documento, String nombres, String apellidos, String telefono, String edad, String tipoProfesion) {
		super(documento, nombres, apellidos,telefono, edad);
		this.tipoProfesion = tipoProfesion;
		
	}

	public String getTipoProfesion() {
		return tipoProfesion;
	}

	public void setTipoProfesion(String tipoProfesion) {
		this.tipoProfesion = tipoProfesion;
	}

}
