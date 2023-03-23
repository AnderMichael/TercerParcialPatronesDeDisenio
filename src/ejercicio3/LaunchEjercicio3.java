package ejercicio3;

public class LaunchEjercicio3 {

	public static void main(String[] args) {
		Empresa empresa1 = new EmpresaSRL("Andersaurio");
		empresa1.setEnvio(new EnvioAire());
		Empresa empresa2 = new EmpresaSA("Hugotzilla");
		empresa2.setEnvio(new EnvioAire());
		
		empresa1.envioPaquete(new Paquete("Joyas", 300, 20));
		empresa2.envioPaquete(new Paquete("Cuadernos", 150, 50));

		empresa1.setEnvio(new EnvioTierra());
		empresa2.setEnvio(new EnvioTierra());

		empresa1.envioPaquete(new Paquete("Libros", 100, 20));
		empresa2.envioPaquete(new Paquete("Mochilas", 550, 100));
		
		empresa1.setEnvio(new EnvioMar());
		empresa2.setEnvio(new EnvioMar());

		empresa1.envioPaquete(new Paquete("Fotos", 5, 1));
		empresa2.envioPaquete(new Paquete("Maletas", 750, 1000));
	}

}
