package ejercicio2;

public class AppWeb implements AppInterface{
	private String nombre;
	

	public AppWeb(String nombre) {
		this.nombre = nombre;
	}


	@Override
	public void login(int id, String pasword) {
		System.out.println("Inicio sesion exitoso " + nombre +"!!!");
	}
	


	
}
