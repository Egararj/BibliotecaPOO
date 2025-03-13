package modelo;

import java.time.LocalDate;

public class LibrosPrestados {
	private String isbn;
	private String dni;
	private LocalDate fechaDevolucion;
	
	public LibrosPrestados() {
		
	}

	public LibrosPrestados(String isbn, String dni, LocalDate fechaDevolucion) {
		this.isbn = isbn;
		this.dni = dni;
		this.fechaDevolucion = fechaDevolucion;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public LocalDate getFechaDevolucion() {
		return fechaDevolucion;
	}

	public void setFechaDevolucion(LocalDate fechaDevolucion) {
		this.fechaDevolucion = fechaDevolucion;
	}
	
	

}
