package motores;

import combustibles.Combustible;
import combustibles.Diesel;

public class MotorDiesel implements Motor<Diesel> {

	
	@Override
	public Diesel getTipo() {
		return new Diesel();
	}

}
