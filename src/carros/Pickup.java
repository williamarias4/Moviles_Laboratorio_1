package carros;

import motores.Motor;

public class Pickup extends CarroBase {

	public Pickup(Motor motor) {
		super(motor);
	}

	@Override
	public void imprimirCategoria() {
		System.out.println("Soy pickup");
		imprimirMotor();

	}

}
