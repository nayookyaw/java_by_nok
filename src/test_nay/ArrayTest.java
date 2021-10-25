package test_nay;

public class ArrayTest {

	public static void main (String args[])
	{
		Integer carYear[] = new Integer[2];
		
		carYear[0] = 1992;
		carYear[1] = 2012;
		
		for (int car : carYear)
		{
			System.out.println(car);
		}
		
		
	}
}
