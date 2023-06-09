package ejercicio1;

import java.util.Random;

public class Automovil implements IAutomovil {

	private String nombre;
	private String tipo;
	private int gasolina;
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
		int gasolina = random.nextInt(100);
		this.gasolina = gasolina;
		System.out.println(String.format("Se recargaron alrededor de %d Lts", this.gasolina));
	
	}

	@Override
	public int estadoCombustible() {
		int estado = random.nextInt(99) + 1;
		return estado;
	}
	
	@Override
	public void showInfo() {
		System.out.println("*****Automovil*****");
		System.out.println(String.format("Nombre: %s", nombre));
		System.out.println(String.format("Tipo: %s", tipo));
		System.out.println(String.format("Estado Combustible: %d",estadoCombustible()));
		System.out.println(String.format("Gasolina: %d Lts", gasolina));
		System.out.println("*******************");
	}

}
