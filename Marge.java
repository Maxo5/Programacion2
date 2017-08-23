public class Marge extends Simpson {


	public Marge(String nombre) {
		super(nombre);
	}

	public void cuidaA(Simpson alguien) {
		if (this.energia >= 4) {
			System.out.println("Marge cuida a " + alguien.nombre);
			alguien.setSalud(alguien.salud + 3);
			if (alguien.salud > 10) {
				alguien.setSalud(10);
			}
			this.energia = this.energia - 4;
			System.out.println("La energía de Marge es ahora " + this.energia
					+ " y la salud de " + alguien.nombre + alguien.salud);
		} else {
			System.out.println("Energía insuficiente para cuidar a alguien");
		}
	}
}
