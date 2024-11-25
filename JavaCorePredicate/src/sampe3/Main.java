package sampe3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat cat1 = new Cat("Frenk", 10);
		Cat cat2 = new Cat("Elizabet", 4);
		Cat cat3 = new Cat("Fredrik", 13);
		Cat cat4 = new Cat("Melissa", 7);
		Cat cat5 = new Cat("Felix", 5);
		Cat cat6 = new Cat("Olivia", 2);

		List<Cat> cats = new ArrayList<>(List.of(cat1, cat2, cat3, cat4, cat5, cat6));

		System.out.println("Input age");
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		Predicate<Cat> pr1 = a -> a.getAge() < age;
		System.out.println("Set letter");
		char firstChar = (sc.next()).charAt(0);
		Predicate<Cat> pr2 = a -> a.getName().charAt(0) > firstChar;

		cats.removeIf(pr1.and(pr2));

		System.out.println(cats);
	}

}
