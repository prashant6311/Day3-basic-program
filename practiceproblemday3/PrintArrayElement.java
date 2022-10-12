package practiceproblemday3;

import java.util.Random;
import java.util.Scanner;

public class PrintArrayElement {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter size of array: ");
		int size = scanner.nextInt();
		
		int integers[] = new int[size];
		
		Random random = new Random();
		for (int k = 0; k < integers.length; k++)
			// Generating 2 digit random integers.
			integers[k] = 10 + random.nextInt(90);
		
		for (int i = 0; i < integers.length; i++) {
			System.out.print(integers[i] + " ");
		}
	}

}
