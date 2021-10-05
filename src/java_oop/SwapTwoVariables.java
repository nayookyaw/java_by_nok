package java_oop;

public class SwapTwoVariables {

	public static void main(String[] args)
	{
		Integer first_val = 67;
		Integer second_val = 5;
		
		first_val = first_val + second_val;
		second_val =  first_val - second_val;
		first_val = first_val - second_val;
		
		System.out.println("After swap");
		System.out.println(first_val);
		System.out.println(second_val);
	}
}
