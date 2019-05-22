package co.com.bussnineslogic;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.StringJoiner;

import javax.swing.JOptionPane;

import co.com.beans.Cliente;
import co.com.beans.Mascota;
import co.com.beans.Profesional;
import co.com.beans.Servicio;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mascota mascota1 = new Mascota("1","Agatha","15-07-2017","1","Criollo","Hembra");
		Mascota mascota2 = new Mascota("2","Demian","09-04-2018","1","Criollo","Macho");
		Mascota mascota3 = new Mascota("3","Toby","12-08-2014","4","Criollo","Macho");
		Mascota mascota4 = new Mascota("4","Niña","05-06-2010","1","Criollo","Hembra");
		Mascota mascota5 = new Mascota("5","Roberto","15-03-2013","6","Criollo","Macho");
		
		ArrayList<Mascota> lista = new ArrayList<Mascota>();
		lista.add(mascota1);
		lista.add(mascota2);
		
		ArrayList<Mascota> lista2 = new ArrayList<Mascota>();
		lista2.add(mascota3);
		lista2.add(mascota4);
		
		ArrayList<Mascota> lista3 = new ArrayList<Mascota>();
		lista3.add(mascota5);
		
		Cliente cliente1 = new Cliente("1037669419","Julian","Alvarez","3226651374","19",lista);
		Cliente cliente2 = new Cliente("1025975521","Yeni","Soto","33013675432","20",lista2);
		Cliente cliente3 = new Cliente("1000287654","Sara","Usuga","3017424204","18",lista3);
		
		Profesional profesional1 = new Profesional("1023765432","Sebastian","Gallego","3017424204","18","Vendedor");
		Profesional profesional2 = new Profesional("1045632109","Carolina","Arias","3124536798","18","Vendedor");
		Profesional profesional3 = new Profesional("1023765432","Mariana","Estrada","3229875307","18","Veterinaria");
		Profesional profesional4 = new Profesional("1087654321","Daniel","Amaya","3018765433","19","Veterinario");
		
		ArrayList<Profesional> listaServicio1 = new ArrayList<Profesional>();
		listaServicio1.add(profesional1);	
		listaServicio1.add(profesional2);
		
		ArrayList<Profesional> listaServicio2 = new ArrayList<Profesional>();
		listaServicio2.add(profesional3);	
		listaServicio2.add(profesional4);
		
		Servicio servicio1 = new Servicio("09Li","Limpieza",listaServicio2);
		Servicio servicio2 = new Servicio("09Ju","Jugetes",listaServicio1);
		Servicio servicio3 = new Servicio("09Re","Revision",listaServicio2);
		Servicio servicio4 = new Servicio("09Al","Alimento",listaServicio1);
		
		
		
		//**JOptionPane.showMessageDialog(null, mascota1.getNombre());
		//**JOptionPane.showMessageDialog(null, cliente1.getMascota().get(0).getNombre());
		//**JOptionPane.showMessageDialog(null, cliente2.getMascota().get(0).getNombre());
		//**JOptionPane.showMessageDialog(null, cliente3.getMascota().get(0).getNombre());
		//**JOptionPane.showMessageDialog(null, servicio1.getProfesional().get(0).getNombres());
		//**JOptionPane.showMessageDialog(null, servicio2.getProfesional().get(0).getNombres());
		//**JOptionPane.showMessageDialog(null, servicio3.getProfesional().get(0).getNombres());
		//**JOptionPane.showMessageDialog(null, servicio4.getProfesional().get(0).getNombres());
		
		System.out.println("==> For Loop lista de mascotas de "+cliente1.getNombres());
		for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i).getNombre());
		}
		
		System.out.println("\n==> Advance For Loop Example..");
		for (Mascota temp : lista2) {
			System.out.println(temp.getNombre());
		}
		
		System.out.println("\n==> Iterator Example...");
		Iterator<Mascota> listaM = lista3.iterator();
		while (listaM.hasNext()) {
			System.out.println(listaM.next().getNombre());
		}
		
		System.out.println("\n==> While Loop Example....");
		int i = 0;
		while (i < listaServicio1.size()) {
			System.out.println(listaServicio1.get(i).getNombres());
			i++;
		}
		
		System.out.println("lista de profesionales");
		listaServicio2.forEach((servi) -> {
			System.out.println(servi.getNombres());
		});
		
		StringJoiner sj = new StringJoiner(", ");
        sj.add(cliente1.getNombres());
        sj.add(cliente2.getNombres());
        sj.add(cliente3.getNombres());
        String result = sj.toString();
        System.out.println(result);
        
        StringJoiner sj1 = new StringJoiner("/", "prefix-", "-suffix");
        sj1.add("2016");
        sj1.add("02");
        sj1.add("26");
        String result1 = sj1.toString();
        System.out.println(result1);
	}

}
