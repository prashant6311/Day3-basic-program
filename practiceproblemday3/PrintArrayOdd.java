package practiceproblemday3;

import java.util.Random;
import java.util.Scanner;

public class PrintArrayOdd {
	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int size = scanner.nextInt();
		
		int []numbers = new int[size];
		Random random = new Random();
		System.out.println("Array elements: ");
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = 10 + random.nextInt(90);
			System.out.print(numbers[i] + " ");
		}
		
		System.out.println("\n\nElements at odd positions: ");
		for (int i = 0; i < size; i++)
			if (i % 2 != 0)
				System.out.print(numbers[i] + " ");


	}

}


