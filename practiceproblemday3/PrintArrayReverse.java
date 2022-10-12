package practiceproblemday3;

import java.util.Random;
import java.util.Scanner;

public class PrintArrayReverse {
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
		
		
		int temp;
		for (int i = 0; i < size/2; i++) {
			temp = numbers[i];
			numbers[i] = numbers[size - i - 1];
			numbers[size - i - 1] = temp;
		}
		System.out.println("\n\nArray elements in reverse order: ");
		for (int i = 0; i < size; i++)
			System.out.print(numbers[i] + " ");
	}

}


