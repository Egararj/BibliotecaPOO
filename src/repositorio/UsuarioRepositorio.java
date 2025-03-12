package repositorio;

import java.util.ArrayList;
import java.util.List;

import excepciones.CampoVacioException;
import excepciones.CodPostalException;
import excepciones.DniException;
import modelo.*;

public class UsuarioRepositorio {
	
	private static void UsuarioRepositorio() throws CampoVacioException, DniException, CodPostalException {
		
		List<Usuario> usuarios = new ArrayList<Usuario>();
		usuarios.add(new Usuario("pablo","garcia","21150568K", new Direccion("larga","lebrija","sevilla","41740")));
		usuarios.add(new Usuario("ana","garcia","21150568K", new Direccion("larga","lebrija","sevilla","41740")));
		usuarios.add(new Usuario("juan","garcia","21150568K", new Direccion("corta","trebujena","cadiz","11440")));
	}
	
	
	
	//usuarios.add(new Usuario("pablo","garcia","21150568K", new Direccion("larga","lebrija","sevilla","41740")));

	public UsuarioRepositorio() {
		
	}

}
