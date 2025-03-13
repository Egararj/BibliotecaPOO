package modelo;

import java.time.LocalDate;

import excepciones.CampoVacioException;
import excepciones.IsbnException;

public class Libro {
	private String isbn;
	private String titulo;
	private String autor;
	private String editorial;
	private LocalDate fechaPrestamo;
	private LocalDate fechaDevolucion;
	private boolean prestado;

	public Libro() {
		
	}

	public Libro(String isbn, String titulo, String autor, String editorial) throws IsbnException, CampoVacioException {
		this.setIsbn(isbn);
		this.setTitulo(titulo);
		this.setAutor(autor);
		this.setEditorial(editorial);
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) throws IsbnException, CampoVacioException {
		try {
			if(isbn.length() == 0) throw new CampoVacioException();
			if(isbn.length() != 9) throw new IsbnException();
	        int isbnNum = 0, resto=0;

			 for (int x=0, cont=3; x<isbn.length()-1; x++){
		            if(cont%2==0){
		                isbnNum+=Integer.parseInt(String.valueOf(isbn.charAt(x)))*3;
		            }
		            else{
		                isbnNum+=Integer.parseInt(String.valueOf(isbn.charAt(x)));
		            }
		            cont++;
		        }
		        resto=isbnNum%10;
		        resto=(10-resto);
		        if(resto==10) resto=0;

		        if(resto!=Integer.parseInt(String.valueOf(isbn.charAt(12)))){
		            throw new IsbnException();
		        }
		}catch(Exception e){
			throw new IsbnException();
		}
		
		this.isbn = isbn;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) throws CampoVacioException {
		if(titulo.length() == 0) throw new CampoVacioException();
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) throws CampoVacioException {
		if(autor.length() == 0) throw new CampoVacioException();

		this.autor = autor;
	}

	public String getEditorial() {
		return editorial;
	}

	public void setEditorial(String editorial) throws CampoVacioException {
		if(editorial.length() == 0) throw new CampoVacioException();

		this.editorial = editorial;
	}

	public LocalDate getFechaPrestamo() {
		return fechaPrestamo;
	}

	public void setFechaPrestamo(LocalDate fechaPrestamo) {
		this.fechaPrestamo = fechaPrestamo;
	}

	public LocalDate getFechaDevolucion() {
		return fechaDevolucion;
	}

	public void setFechaDevolucion(LocalDate fechaDevolucion) {
		this.fechaDevolucion = fechaDevolucion;
	}

	public boolean isPrestado() {
		return prestado;
	}

	public void setPrestado(boolean prestado) {
		this.prestado = prestado;
	}

	
}
