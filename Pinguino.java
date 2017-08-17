
public class Pinguino extends Ave implements INadador {
	
	private boolean puedoNadar() {
		return this.energia >= 8;
	}

	@Override
	public void nada() {
		if (this.puedoNadar()) {

			this.energia = this.energia - 8;
			System.out.printf("Nadé %.02f metros.", Math.random() * 10);
		} else {
			System.out.println("No puede nadar, energia insuficiente.");
		}

	}
	
	
	
	
}
