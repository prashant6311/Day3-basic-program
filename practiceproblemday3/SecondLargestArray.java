package practiceproblemday3;

import java.util.Random;
import java.util.Scanner;

public class SecondLargestArray {
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
		int bubble;
		for (int i = 0; i < 2; i++) {
			bubble = numbers[0];
			for (int j = 1; j < size - i; j++)
				if (bubble > numbers[j]) {
					numbers[j - 1] = numbers[j];
					numbers[j] = bubble;
				}
				else
					bubble = numbers[j];
		}
		
		System.out.println("\n\nSecond largest element of array = " + numbers[size - 2]);
		
	}
	

}
