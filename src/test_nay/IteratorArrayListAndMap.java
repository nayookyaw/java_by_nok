package test_nay;

import java.util.ArrayList;
import java.util.Arrays;

public class IteratorArrayListAndMap {

	public static void main(String args[])
	{
		System.out.println("program start");
		ArrayList<String> carList = new ArrayList<String>();
		carList.add("BMW");
		carList.add("Ford");
		carList.add("BMW");
		System.out.println(carList);
		
		System.out.println(carList.contains("Ford"));
		
		String strArray [] = new String [] {"Mercede"};
		System.out.println(strArray[0]);
		
		ArrayList<String> strToArrayList = new ArrayList<String>(Arrays.asList(strArray));
		System.out.println(strToArrayList);
		
		
	}
}
