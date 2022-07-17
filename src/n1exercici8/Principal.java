package n1exercici8;

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
