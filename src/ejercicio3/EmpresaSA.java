package ejercicio3;

public class EmpresaSA extends Empresa {

	public EmpresaSA(String nombre) {
		super(nombre + "SA");
	}

	@Override
	public void envioPaquete(Paquete paquete) {
		System.out.println("El siguiente paquete es enviado por " + getNombre());
		System.out.println(String.format("*****Envio - %s*****", getEnvio().getNombre()));
		System.out.println(String.format("Paquete: %s", paquete.getNombre()));
		System.out.println(String.format("PrecioPaquete: %.2f", paquete.getPrecio()));
		System.out.println(String.format("PesoPaquete: %.2f", paquete.getPeso()));
		System.out.println(String.format("NuevoPrecio: %.2f", getEnvio().getNewPrecio(paquete.getPrecio())));
		System.out.println("*************************");

	}

}
