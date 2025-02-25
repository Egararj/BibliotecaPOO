package modelo;

import excepciones.CampoVacioException;

public class Usuario {
	private String nombre;
	private String apellido;
	private String dni;
	private Direccion direccion;

	public Usuario() {

	}

	public Usuario(String nombre, String apellido, String dni, Direccion direccion) throws CampoVacioException {
		this.setNombre(nombre);
		this.setApellido(apellido);
		this.setDni(dni);
		this.setDireccion(direccion);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) throws CampoVacioException{
		if(nombre.length() == 0) throw new CampoVacioException();
		
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) throws CampoVacioException {
		if(apellido.length() == 0) throw new CampoVacioException();
		this.apellido = apellido;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) throws CampoVacioException {
		if(dni.length() == 0) throw new CampoVacioException();
		this.dni = dni;
	}

	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}
	
	

}
