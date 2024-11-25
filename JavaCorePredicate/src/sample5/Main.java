package sample5;

import java.util.Arrays;
import java.util.Random;
import java.util.function.IntPredicate;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rd = new Random();

		int[] array = new int[15];
		for (int i = 0; i < array.length; i++) {
			array[i] = rd.nextInt(50);
		}
		System.out.println(Arrays.toString(array));

		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i] + " " + even(array[i], a -> a % 2 == 0));
		}

	}

	public static boolean even(int num, IntPredicate pr) {
		int sum = 0;
		while(num>0) {
			sum+=num%10;
			num/=10;
		}
		return pr.test(sum);
	}

}
