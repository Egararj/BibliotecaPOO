package excepciones;

public class CampoVacioException extends Exception{

	public CampoVacioException() {
		super("No puedes dejar el campo vacío");
	}

}
