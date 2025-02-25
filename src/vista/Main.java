package vista;

import excepciones.CampoVacioException;
import modelo.*;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hola mundo desde Biblioteca");
		try {
			Usuario usuario = new Usuario("pepe", "garcia", "21150568K", new Direccion("fuentes", "cadiz", "cadiz", "11400"));
			System.out.println("Usuario creado correctamente");

		} catch (CampoVacioException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	}

}
