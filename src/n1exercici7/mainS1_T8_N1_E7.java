package n1exercici7;

import java.util.Comparator;
import java.util.List;

//Amb la llista de l’exercici anterior, ara ordena-la al revés, de cadena més llarga a més curta.

public class mainS1_T8_N1_E7 {

	public static void main(String[] args) {
		List<String> list = List.of("low1", "show127", "d1ark", "luck2000000", "angry", "FLOW", "111", "solo 1111111111");

		Comparator<String> compByLength = Comparator.comparing(word -> word.length());

		list.stream().sorted(compByLength.reversed()).forEach(System.out::println);

	}

}
