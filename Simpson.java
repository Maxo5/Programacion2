
public abstract class Simpson {

public String nombre;
protected int energia;
protected int salud;

public Simpson (String nombre){
	this.nombre = nombre;
	this.energia = 10;
	this.salud = 10;
}


public void come(){
	System.out.println(this.nombre + "comió y recuperó energía.");
	this.energia = this.energia + (int)Math.random()*10;
	if (this.energia > 10){
		this.energia = 10;
	}
	System.out.println("Su energía es ahora" + this.energia);
}


public int getEnergia() {
	return energia;
}

public void setEnergia(int energia) {
	this.energia = energia;
}

public int getSalud() {
	return salud;
}

public void setSalud(int salud) {
	this.salud = salud;
}
}
