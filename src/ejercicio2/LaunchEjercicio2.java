package ejercicio2;

public class LaunchEjercicio2 {

	public static void main(String[] args) {
		ProxyAppWeb prowxy = new ProxyAppWeb();
		prowxy.setAppInterface(new AppWeb("AndresaurioStoree"));
		
		prowxy.addUsuario(new Usuario(11, "Ander", "Chef1"));
		prowxy.login(11, "Chef1");

		prowxy.addUsuario(new Usuario(12, "Hugo", "Chef2"));
		prowxy.login(12, "Chef1");
		
	}

}
 