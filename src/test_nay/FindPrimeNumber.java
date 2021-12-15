package test_nay;

public class FindPrimeNumber {

	public static void main(String args[])
	{
		System.out.println("program start");
		
		boolean isPrime = true;
		int temp;
		
		int input = 225;
		System.out.println(input);
		
		if (input<2) {
			System.out.println("Input is wrong");
			return;
		}
		
		System.out.println(input/2);
		
		for (int i=2; i<= input/2; i++)
		{
			temp = input % i;
			System.out.println(temp);
			if (temp == 0)
			{
				isPrime = false;
				break;
			}
		}
		
		if (isPrime) {
			System.out.println("Input is prime number");
		} else {
			System.out.println("Input is not prime number");
		}
	}
}
