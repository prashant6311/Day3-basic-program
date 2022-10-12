package practiceproblemday3;

import java.util.Random;
import java.util.Scanner;

public class LargestElementArray {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter array size: ");
		int size = scan.nextInt();
		int[] numbers = new int[size];
		
		Random random = new Random();
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = 10 + random.nextInt(90);
			System.out.print(numbers[i] + " ");
		}
		
		int max = numbers[0];
		for (int i = 0; i < numbers.length - 1; i++)
			if (max < numbers[i + 1])
				max = numbers[i + 1];
		
		System.out.println("\nLargest element of array = " + max);
	}
}
	

