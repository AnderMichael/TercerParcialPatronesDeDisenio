package ejercicio2;

public class LaunchEjercicio2 {

	public static void main(String[] args) {
		ProxyAppWeb prowxy = new ProxyAppWeb();
		prowxy.setAppInterface(new AppWeb("AndresaurioStoree"));
		
		

	}

}
