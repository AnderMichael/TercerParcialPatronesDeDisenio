package ejercicio1;

public class LaunchEjercicio1 {

	public static void main(String[] args) {
		IAutomovil auto1 = new AutoDiesel("Truck truck");
		IAutomovil auto2 = new AutoGasolina("Car car");
		IAutomovil auto3 = new AutoGasolinaEspecial("Lamborgini");

		auto1.llenarGasolina();
		auto1.showInfo();
		
		auto2.llenarGasolina();
		auto2.showInfo();
		
		auto3.llenarGasolina();
		auto3.showInfo();
		
		AutomovilElectrico automovilElectrico = new  AutomovilElectrico("Tesla");
		AutomovilElectricoAdapter adapter = new AutomovilElectricoAdapter(automovilElectrico);
		
		adapter.llenarGasolina();
		adapter.showInfo();
	}

}
 