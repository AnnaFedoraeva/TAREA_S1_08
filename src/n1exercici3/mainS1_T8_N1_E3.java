package n1exercici3;

import java.util.Arrays;
import java.util.List;

//Crea una llista amb els noms dels mesos de l?any. 
//Imprimeix tots els elements de la llista amb una lambda.

public class mainS1_T8_N1_E3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		List<String> meses = Arrays.asList("enero", "febrero", "marzo", "abril", "mayo", "junio","julio","agosto","septimebre","octubre","noviembre","diciembre");
		meses.forEach((mes) -> System.out.println(mes));
		
	
	}

}
