package test_nay;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListTest {

	public static void main(String args[])
	{
		System.out.println("Start program");
		
		String [] carList = new String[3];
		
		carList[0] = "BMW";
		carList[1] = "Mercede";
		System.out.println(carList[0]);
		
		// Arraylist
		List<String> laptopList = new ArrayList<String>();
		laptopList.add("Apple");
		
		for (String laptop : laptopList)
		{
			System.out.println(laptop);
		}
		
//		System.out.println(laptopList.get(0));
	}
}
