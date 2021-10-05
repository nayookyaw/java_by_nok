package test_nay;

public class SwapTwoVal {

	public static void main (String [] args) {
		System.out.println("Program starts");
		
		Integer first = 4;
		Integer second = 3;
		
		first = first + second;
		second = first - second;
		first = first - second;
		
		System.out.println("After swap");
		System.out.println(first);
		System.out.println(second);
	}
}
