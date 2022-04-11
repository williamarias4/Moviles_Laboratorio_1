package test;

import carros.CarroBase;
import carros.Crossover;
import carros.Pickup;
import carros.Sedan;
import carros.Suv;
import motores.Motor;
import motores.MotorDiesel;
import motores.MotorGasolina;

public class Test {

	public static void main(String[] args) {
		CarroBase carro;
		Motor motorDiesel = new MotorDiesel();
		Motor motorGasolina = new MotorGasolina();

		carro = new Pickup(motorDiesel);
		carro.imprimirCategoria();

		carro = new Sedan(motorGasolina);
		carro.imprimirCategoria();

		carro = new Suv(motorDiesel);
		carro.imprimirCategoria();

		carro = new Crossover(motorDiesel);
		carro.imprimirCategoria();

		carro = new Crossover(motorGasolina);
		carro.imprimirCategoria();

	}

}
