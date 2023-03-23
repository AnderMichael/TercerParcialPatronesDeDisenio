package ejercicio3;

public abstract class Envio {
	private double descuento;
	private String nombre;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getDescuento() {
		return descuento;
	}

	public void setDescuento(double descuento) {
		this.descuento = descuento;
	}

	public double getNewPrecio(double precio) {
		double newPrecio = precio + precio * getDescuento() / 100.0;
		return newPrecio;
	}

	public Envio(double descuento, String nombre) {
		this.descuento = descuento;
		this.nombre = nombre;
	}

}
