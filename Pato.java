
public class Pato extends Ave implements IVolador, INadador {

	private String nombre;

	public void canta() {
		System.out.println("Yo soy un el pato " + this.nombre + ".");
		super.canta();
	}

	public Pato() {
		this.nombre = "Anonimo";
		this.energia = 10;
	}

	public Pato(String nombre) {
		this.nombre = nombre;
		this.energia = 10;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	private boolean puedoVolar() {
		return this.energia >= 6;
	}

	@Override
	public void vola() {
		if (this.puedoVolar()) {

			this.energia = this.energia - 6;
			System.out.printf("Vole %.02f metros.\n", Math.random() * 10);
		} else {
			System.out.println("No puede volar, energia insuficiente.");
		}

	}

	private boolean puedoNadar() {
		return this.energia >= 1;
	}

	@Override
	public void nada() {
		if (this.puedoNadar()) {

			this.energia = this.energia - 1;
			System.out.printf("Nadé %.02f metros.", Math.random() * 10);
		} else {
			System.out.println("No puede nadar, energia insuficiente.");
		}

	}
	

}
