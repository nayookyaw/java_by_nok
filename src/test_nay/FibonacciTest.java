package test_nay;

import java.util.Scanner;

public class FibonacciTest {

	public static void main(String args[])
	{
		System.out.println("program start");
		
		int input;
		int init = 0, next = 0, sum = 1;
		
		Scanner scan_in = new Scanner(System.in);
		System.out.println("Enter the number of times");
		input = scan_in.nextInt();
		
		for (int i=0; i < input; i++)
		{
			init = next;
			next = sum;
			sum = init + next;
			System.out.println(init);
		}
				
	}
}
