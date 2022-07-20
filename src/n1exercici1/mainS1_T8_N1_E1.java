package n1exercici1;

import java.util.List;

//A partir d’una llista de Strings, escriu un mètode que retorna una llista de totes les cadenes que contenen la lletra ‘o’. Imprimeix el resultat.

import java.util.stream.Collectors;

public class mainS1_T8_N1_E1 {

	public static void main(String[] args) {

		List<String> list = List.of("low", "show", "dark", "luck", "angry", "FLOW");
		List<String> wordsWithO = wordsWithO(list);
		System.out.println(wordsWithO);
	}

	public static List<String> wordsWithO(List<String> list) {
		final List<String> containsO = list.stream().filter(name -> name.toUpperCase().contains("O"))
				.collect(Collectors.toList());
		// System.out.println(containsO.toString());
		return containsO;

	}

}
