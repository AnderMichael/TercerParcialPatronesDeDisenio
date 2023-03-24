package ejercicio2;


public class ProxyAppWeb implements AppInterface {
	private AppInterface appInterface;
	private Servidor servidor1 = new Servidor("Servidor Primos");
	private Servidor servidor2 = new Servidor("Servidor NO Primos");

	public AppInterface getAppInterface() {
		return appInterface;
	}

	public void setAppInterface(AppInterface appInterface) {
		this.appInterface = appInterface;
	}

	@Override
	public void login(int id, String pasword) {
		if (servidor1.getBd().containsKey(id)) {
			if(servidor1.getBd().get(id).equals(pasword)) {
				appInterface.login(id, pasword);
			}else {
				System.out.println("Inicio de sesion fallido");
			}
		} else if (servidor2.getBd().containsKey(id)) {
			if(servidor2.getBd().get(id).equals(pasword)) {
				appInterface.login(id, pasword);
			}else {
				System.out.println("Inicio de sesion fallido");
			}
		} else {
			System.out.println("El usuario no existe en nuestros servidores");
		}

	}

	public void addUsuario(Usuario usuario) {
		if(isPrimo(usuario.getId())) {
			servidor1.addUsuario(usuario.getId(), usuario);
		}else {
			servidor2.addUsuario(usuario.getId(), usuario);
		}
	}

	public boolean isPrimo(int id) {
		for (int i = 2; i < id; i++) {
			if (id % i == 0) {
				return false;
			}
		}
		return true;
	}

}
