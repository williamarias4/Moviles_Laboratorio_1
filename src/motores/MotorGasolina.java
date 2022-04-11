package motores;

import combustibles.Gasolina;

public class MotorGasolina implements Motor<Gasolina> {

	@Override
	public Gasolina getTipo() {
		return new Gasolina();
	}

}
