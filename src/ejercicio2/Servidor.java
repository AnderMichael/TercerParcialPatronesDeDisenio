package ejercicio2;

import java.util.HashMap;
import java.util.Map;

public class Servidor {
	private String nombre;
	private Map<Integer, Usuario> bd = new HashMap<>();

	public Servidor(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Map<Integer, Usuario> getBd() {
		return bd;
	}

	public void setBd(Map<Integer, Usuario> bd) {
		this.bd = bd;
	}

	public void addUsuario(int id, Usuario usuario) {
		bd.put(id, usuario);
		System.out.println("El usuario esta siendo guardado por el " + nombre);
	}

}
