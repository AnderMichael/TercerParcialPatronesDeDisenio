package ejercicio3;

public class Paquete {

	private String nombre;
	private double precio;
	private double peso;

	public Paquete(String nombre, double precio, double peso) {
		this.nombre = nombre;
		this.precio = precio;
		this.peso = peso;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

}
