package practiceproblemday3;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayAcendingOrder {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size of Array: ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter "+size+" Elements");
			for(int i=0; i<arr.length; i++)
			{
				arr[i]= sc.nextInt();
			}
			Arrays.sort(arr);
			System.out.println("Sorted Elements are: ");
			for(int i=0; i<arr.length; i++)
			{
				System.out.println(arr[i]);
			}

	}

}
	


