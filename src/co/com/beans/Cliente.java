package co.com.beans;

import java.util.ArrayList;

public class Cliente extends Persona {
	private ArrayList<Mascota> mascota;
	
	public Cliente(String documento, String nombres, String apellidos, String telefono, String edad, ArrayList<Mascota> mascota) {
		super(documento, nombres, apellidos,telefono, edad);
		this.mascota = mascota;
		
	}
	
	public ArrayList<Mascota> getMascota() {
		return mascota;
	}

	public void setMascota(ArrayList<Mascota> mascota) {
		this.mascota = mascota;
	}
	
}
