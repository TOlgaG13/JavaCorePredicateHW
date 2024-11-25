package sample2;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 List<String> strings = new ArrayList<>(List.of("hand", "angry", "try", "hello", "tiger","good"));
	        char[] letters = {'h', 'a', 't'};

	        Predicate<String> startsWithAny = str -> {
	            for (char c : letters) {
	                if (str.startsWith(String.valueOf(c))) {
	                    return true;
	                }
	            }
	            return false;
	        };

	        strings.removeIf(startsWithAny);

	        System.out.println(strings);
	}

}
