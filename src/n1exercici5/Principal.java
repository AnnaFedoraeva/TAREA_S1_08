package n1exercici5;

public class Principal {

	public static void main(String[] args) {
		Functional_Interface instanciar = (pi) -> {
			return pi;
		};

		double piValue = 3.1415;

		double printPi = instanciar.getPiValue(piValue);

		System.out.println(printPi);

	}

}
