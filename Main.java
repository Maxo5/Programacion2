
public class Main {

	public static void main(String[] args) {
		Calculadora calc = new Calculadora();
		calc.reset();
		calc.sumar(2,3);
		calc.multiplicar(2);
		System.out.println(calc.estado);

		
		
	}

}
