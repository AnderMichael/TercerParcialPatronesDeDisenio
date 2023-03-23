package ejercicio3;

public class EmpresaSRL extends Empresa {

	public EmpresaSRL(String nombre) {
		super(nombre + "SRL");
	}

	@Override
	public void envioPaquete(Paquete paquete) {
		System.out.println("Por... " + getNombre());
		System.out.println(String.format("*****Envio - %s*****", getEnvio().getNombre()));
		System.out.println(String.format("Paquete: %s", paquete.getNombre()));
		System.out.println(String.format("PrecioPaquete: %.2f", paquete.getPrecio()));
		System.out.println(String.format("PesoPaquete: %.2f", paquete.getPeso()));
		System.out.println(String.format("NuevoPrecio: %.2f", getEnvio().getNewPrecio(paquete.getPrecio())));
		System.out.println("*************************");

	}

}
