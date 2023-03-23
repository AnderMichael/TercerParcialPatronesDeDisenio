package ejercicio2;

import java.util.HashMap;
import java.util.Map;

public class Servidor {
	private String nombre;
	private Map<String, Usuario> bd = new HashMap<>();

	public Servidor(String nombre) {
		this.nombre = nombre;
	}

}
