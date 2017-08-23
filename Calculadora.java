public class Calculadora {
	public double estado;

	public void reset(){
		this.estado = 0;
	}
	public void sumar(double a, double b) {
		this.estado = a+b;
	}

	public void restar(double a, double b) {
		this.estado = a-b;
	}

	public void multiplicar(double a, double b) {
		this.estado = a*b;
	}

	public void multiplicar(double a) {
		this.estado = this.estado * a;
	}
	
	public void dividir(double a, double b) {
		this.estado = a/b;
	}

	public void potencia(int base, int exponente) {

		estado = 1;
		for (int i = 1; i < exponente+1; i++) {
			multiplicar(base, estado);
		}

	}
}