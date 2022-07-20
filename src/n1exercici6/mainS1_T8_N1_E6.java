package n1exercici6;

import java.util.Comparator;
import java.util.List;


//Crea una llista amb nombres i cadenes de text i ordena la llista amb les cadenes de més curta a més llarga.

public class mainS1_T8_N1_E6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> list = List.of("low1", "show127", "d1ark", "luck2000000", "angry", "FLOW", "111", "solo 1111111111");

		list.stream().sorted(Comparator.comparing(word -> word.length())).forEach(System.out::println);

	}

}
