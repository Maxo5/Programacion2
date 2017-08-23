public class Lisa extends Simpson implements INiño {

	public Lisa(String nombre) {
		super(nombre);
	}

	@Override
	public void juga() {
		if (this.energia >= 3) {
			System.out.println(this.nombre + " jugó.");
			this.energia = this.energia - 3;
		} else {
			System.out.println("Energía insuficiente para jugar.");
		}

	}

}
