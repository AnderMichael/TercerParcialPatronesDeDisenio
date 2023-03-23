package ejercicio1;

public class AutomovilElectricoAdapter implements IAutomovil {

	private AutomovilElectrico automovilElectrico;

	public AutomovilElectricoAdapter(AutomovilElectrico automovilElectrico) {
		this.automovilElectrico = automovilElectrico;
	}

	@Override
	public void llenarGasolina() {
		automovilElectrico.cargar();
	}

	@Override
	public int estadoCombustible() {
		return automovilElectrico.estadoDeElectricidad();
	}

	@Override
	public void showInfo() {
		automovilElectrico.showInfo();
	}

}
