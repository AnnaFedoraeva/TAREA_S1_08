package n1exercici8;

//Crea una Functional Interface que contingui un m�tode anomenat reverse(). 
//Aquest m�tode ha de rebre i ha de retornar un String. En el main() de la classe principal, 
//injecta a la interf�cie creada mitjan�ant una lambda, el cos del m�tode, de manera que torni la mateixa cadena que rep com a par�metre per� al rev�s. 
//Invoca la inst�ncia de la interf�cie passant-li una cadena i comprova si el resultat �s correcte.

public class Principal {

	public static void main(String[] args) {

		InterfaceReverse rev = (word) -> {
			String wordRev = "";
			for (int i = word.length() - 1; i >= 0; i--)
				wordRev += word.charAt(i);
			return wordRev;
		};

		String word = "functional interface";
		System.out.println(rev.reverse(word));
	}
}
