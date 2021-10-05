package test_nay;

import java.util.HashMap;

public class TestHashMap {

	public static void main(String args[])
	{
		HashMap<String, Integer> carList = new HashMap<String, Integer>();
		
		carList.put("model", 1992);
		carList.put("used_year", 1992);
		
		System.out.println(carList);
	}
}
