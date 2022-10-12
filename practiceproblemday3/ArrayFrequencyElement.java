package practiceproblemday3;

import java.util.Scanner;

public class ArrayFrequencyElement {
	 public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size: ");
		
		
		int size= sc.nextInt();
		
		
		int number[] = new int[size];
		
		
		int frequency[] = new int[number.length];
		
		 
		int visit = -1;
		
		System.out.println("Repeated numbers are allowed of length: "+size);
		for(int i=0; i<number.length; i++) 
		{
			number[i] = sc.nextInt();
		}
			
		
		for(int i=0; i<number.length; i++)
		{
			
			int count=1;
			for(int j=i+1; j<number.length; j++)
			{
				
				if(number[i] == number[j])
				{
					
					count++;
					frequency[j]=visit;
				}
				if(frequency[i] != visit)
				{
					
					frequency[i] = count;
				}
			}
		}
System.out.println("Element: "+"\t "+"Frequency:");
	for(int i=0; i<frequency.length; i++)
	{
		if(frequency[i] !=  visit)
		{					
			System.out.println(number[i]+"  \t\t"+frequency[i]);
		}
	}
}
}


