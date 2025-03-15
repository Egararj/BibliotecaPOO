package prueba;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import modelo.Libro;

public class InstanciaLibros {
	
	public static void InstanciaLibros() {
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		try {
			fos = new FileOutputStream("libros.dat");
			oos = new ObjectOutputStream(fos);
			oos.writeObject(new Libro("9788466320535", "Cien años de soledad", "Gabriel García Márquez", "Editorial Sudamericana"));
			oos.writeObject(new Libro( "9788408167877", "El Principito", "Antoine de Saint-Exupéry", "Editorial Salamandra"));
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
