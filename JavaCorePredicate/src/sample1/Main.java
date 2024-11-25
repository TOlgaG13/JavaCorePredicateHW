package sample1;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> cats = new ArrayList<>(List.of("Frenk", "Olivia", "Teodor", "Felix", "Marta", "Fenix"));
		
		Predicate<String> pr1 = str -> str.startsWith("F");
		cats.removeIf(pr1);
		
		System.out.println(cats);
	}

}
