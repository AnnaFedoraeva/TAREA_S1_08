package n1exercici5;

//Crea una Functional Interface amb un m�tode anomenat getPiValue() que ha de retornar un double. 
//Des del main() de la classe principal, inst�ncia la interf�cie i assigna-li el valor 3.1415. 
//Invoca el m�tode getPiValue() i imprimeix el resultat.

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
