package ejercicio1;

import java.util.Random;

public class Automovil implements IAutomovil {

	private String nombre;
	private String tipo;
	private int gasolina;
	private int estadoComb;
	private Random random = new Random();

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Automovil(String nombre, String tipo) {
		this.nombre = nombre;
		this.tipo = tipo;
	}

	@Override
	public void llenarGasolina() {
		int combustible = random.nextInt(100);
	}

	@Override
	public int estadoCombustible() {
		int estado = random.nextInt(99) + 1;
		return estado;
	}

}
