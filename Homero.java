public class Homero extends Simpson {

	public Homero(String nombre) {
		super(nombre);
	}

	public void come() {
		System.out.println(this.nombre + "comió y recuperó energía.");
		this.energia = this.energia + ((int) Math.random() * 10) / 2;
		if (this.energia > 10) {
			this.energia = 10;
		}
		System.out.println("Su energía es ahora" + this.energia);
	}

	public void bebeCerveza() {
		System.out.println(this.nombre
				+ "tomó cerveza. Su salud y energía disminuyeron.");
		this.salud = this.salud - 3;
		if (this.salud < 0) {
			this.salud = 0;
		}
		this.energia = this.energia - 3;
		if (this.energia < 0) {
			this.energia = 0;
		}
		System.out.println("Su salud ahora es " + this.salud + " y su energia "
				+ this.energia);
	}

}
