package n1exercici2;

import java.util.List;
import java.util.stream.Collectors;

//Has de fer el mateix que en el punt anterior, però ara, el mètode ha de retornar una llista amb els Strings 
//que a més de contenir la lletra ‘o’ també tenen més de 5 lletres. 
//Imprimeix el resultat.

public class mainS1_T8_N1_E2 {

	public static void main(String[] args) {

		List<String> list = List.of("low", "showman", "closed", "luck", "angryBird", "FLOW");
		List<String> wordsWithO = wordsWithO(list);
		System.out.println(wordsWithO);
	}

	public static List<String> wordsWithO(List<String> list) {
		final List<String> wordsFiltered = list.stream()
				.filter(name -> name.toUpperCase().contains("O") && name.length() > 5).collect(Collectors.toList());
		return wordsFiltered;

	}

}
