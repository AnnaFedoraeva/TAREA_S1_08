package n1exercici2;

import java.util.List;
import java.util.stream.Collectors;

public class mainS1_T8_N1_E2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> list = List.of("low", "showman", "closed", "luck", "angryBird", "FLOW");
		List <String> wordsWithO = wordsWithO (list);
		System.out.println(wordsWithO);
	}
		
		public static List <String> wordsWithO (List <String> list) {
		final List<String> wordsFiltered =
				  list.stream()
				         .filter(name -> name.toUpperCase().contains("O") && name.length()>5).
				         collect(Collectors.toList());
		//System.out.println(containsO.toString());
		return wordsFiltered;
	
	}

	}


