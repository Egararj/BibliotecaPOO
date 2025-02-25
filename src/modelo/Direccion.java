package modelo;

import excepciones.CampoVacioException;

public class Direccion {
	private String calle;
	private String poblacion;
	private String provincia;
	private String codPostal;
	
	public Direccion() {
		
	}

	public Direccion(String calle, String poblacion, String provincia, String codPostal) throws CampoVacioException {
		this.setCalle(calle);
		this.setPoblacion(poblacion);
		this.setProvincia(provincia);
		this.setCodPostal(codPostal);
		
	}

	public String getCalle() {
		return calle;
	}

	public void setCalle(String calle) throws CampoVacioException {
		if(calle.length() == 0) throw new CampoVacioException();
		this.calle = calle;
	}

	public String getPoblacion() {
		return poblacion;
	}

	public void setPoblacion(String poblacion) throws CampoVacioException {
		if(poblacion.length() == 0) throw new CampoVacioException();
		this.poblacion = poblacion;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) throws CampoVacioException {
		if(provincia.length() == 0) throw new CampoVacioException();
		this.provincia = provincia;
	}

	public String getCodPostal() {
		return codPostal;
	}

	public void setCodPostal(String codPostal) throws CampoVacioException {
		if(codPostal.length() == 0) throw new CampoVacioException();
		this.codPostal = codPostal;
	}

	@Override
	public String toString() {
		return "Direccion [calle=" + calle + ", poblacion=" + poblacion + ", provincia=" + provincia + ", codPostal="
				+ codPostal + "]";
	}
	
	
	
	

}
