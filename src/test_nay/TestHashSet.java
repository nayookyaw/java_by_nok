package test_nay;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class TestHashSet {

	public static void main(String args[])
	{
		System.out.println("Start program");
		
		HashSet<String> carLists = new HashSet<String>();
		
		carLists.add("BMW");
		carLists.add("BMW");
		
		System.out.println(carLists);
		
		String carName = "testtdd";
		System.out.println(carName.length());
		System.out.println(carName.charAt(0));
		
		HashSet<Character> newCarName = new HashSet<Character>();
		List<Character> newCarNameArr = new ArrayList<Character>();
		
		String newCar = "";
		
		for(int i=0; i< carName.length(); i++) {
			newCarName.add(carName.charAt(i));
			
			if (!newCarNameArr.contains(carName.charAt(i))) {
				newCarNameArr.add(carName.charAt(i));
				
				newCar += carName.charAt(i);
			}			
		}
		
//		System.out.println(newCarName);
		System.out.println(newCarNameArr);
		System.out.println("New Unique Name = " + newCar);
		
	}
}
