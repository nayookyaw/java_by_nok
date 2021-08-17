package java_oop;

public class Cast {
	public static void main(String[] args)
	{
		int myInt = 2;
		double myDouble = myInt;
		
		double youDouble = 3;
		int youInt = (int) youDouble;
		
		System.out.println(youDouble);
		System.out.println(youInt);
		
		System.out.println(myDouble);
		System.out.println("Hello World");
	}
}
