package test;

import excepciones.CampoVacioException;
import excepciones.CodPostalException;
import excepciones.DniException;
import modelo.Direccion;
import modelo.Usuario;

public class CompruebaUsuario {
    
    public static void CompruebaUsuario() {
        try {
			Usuario usuario = new Usuario("pepe", "garcia", "21150568K", new Direccion("fuentes", "cadiz", "cadiz", "11400"));
			System.out.println("Usuario creado correctamente");

		} catch (CampoVacioException | DniException | CodPostalException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
    }
}
