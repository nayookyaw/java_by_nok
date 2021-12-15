package test_nay;

import java.util.Arrays;

public class SecondHighestNumber {

	public static void main(String args[])
	{
		System.out.println("program start");
		
		int carYear[] = {20, 12, 34, 90, 34};
		
		Arrays.sort(carYear);
		
		System.out.println(Arrays.toString(carYear));
	}
}
