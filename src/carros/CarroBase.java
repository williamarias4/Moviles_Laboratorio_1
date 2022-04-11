package carros;

import combustibles.Combustible;
import motores.Motor;

public abstract class CarroBase {

	public abstract void imprimirCategoria();

	private Motor motor;

	public CarroBase(Motor motor) {
		this.motor = motor;
	}

	public void imprimirMotor() {
		System.out.println("Motor " + ((Combustible) motor.getTipo()).nombre());
	}

}
