package ejercicio1;

import java.util.Random;

public class AutomovilElectrico implements IAutomovilElectrico {

	private String nombre;
	private String tipo;
	private int energia;
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

	public AutomovilElectrico(String nombre) {
		this.nombre = nombre;
		this.tipo = "Electrico";
	}

	@Override
	public void cargar() {
		int energia = random.nextInt(100);
		this.energia = energia;
		System.out.println(String.format("Se recargaron alrededor de %d kW", this.energia));

	}

	@Override
	public int estadoDeElectricidad() {
		int estado = random.nextInt(9) + 1;
		return estado;
	}

	@Override
	public void showInfo() {
		System.out.println("*****AutomovilElectrico*****");
		System.out.println(String.format("Nombre: %s", nombre));
		System.out.println(String.format("Tipo: %s", tipo));
		System.out.println(String.format("Estado Electricidad: %d", estadoDeElectricidad()));
		System.out.println(String.format("Energia: %d kW", energia));
		System.out.println("*******************");
	}

}
