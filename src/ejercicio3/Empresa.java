package ejercicio3;

public abstract class Empresa {
	private String nombre;
	private Envio envio;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Envio getEnvio() {
		return envio;
	}

	public void setEnvio(Envio envio) {
		this.envio = envio;
	}

	public abstract void envioPaquete(Paquete paquete);

	public Empresa(String nombre) {
		this.nombre = nombre;
	}

}
