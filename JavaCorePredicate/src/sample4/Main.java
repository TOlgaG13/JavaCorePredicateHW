package sample4;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiPredicate;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String> words = new HashMap<>();
        String[] array = new String[] { "apple", "berry", "cherry", "dragon", "elder", "fig", "grape", "honey", 
        	    "iris", "jungle", "kiwi", "lemon", "melon", "nectar", "orange", 
        	    "peach", "quince", "raisin", "straw", "tomato", "ugli", "vanilla", 
        	    "walnut", "xigua", "yam", "zebra" };
        for (int i = 0; i < array.length; i++) {
            words.put(i, array[i]);
        }

        BiPredicate<Integer, String> bipr = (index, word) -> index != word.length();

        
        words.entrySet().removeIf(entry -> bipr.test(entry.getKey(), entry.getValue()));

        System.out.println(words);
	}

}
