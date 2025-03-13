package modelo;

import excepciones.CampoVacioException;
import excepciones.CodPostalException;
import excepciones.DniException;

public class Usuario {
	private String nombre;
	private String apellido;
	private String dni;
	private Direccion direccion;

	public Usuario() {

	}

	public Usuario(String nombre, String apellido, String dni, Direccion direccion) throws CampoVacioException, DniException, CodPostalException {
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

	public void setDni(String dni) throws CampoVacioException, DniException {
		if(dni.length() == 0) throw new CampoVacioException();
		try{
		if(dni.length() != 9) throw new DniException();
		int numDni = Integer.parseInt(dni.substring(0, 8));
		int resto = numDni%23;
		char letraDni = dni.charAt(8);
		char[] letras = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
		if(letras[resto] != letraDni) throw new DniException();
		}catch(Exception e){
			throw new DniException();
		}

		this.dni = dni;
	}

	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) throws CampoVacioException, CodPostalException{
		this.direccion = direccion;
	}
	
	

}
