package test_nay;

import java.util.LinkedHashMap;

public class TestLinkedHashMap {

	public static void main (String args[])
	{
		LinkedHashMap<String, Integer> carsList = new LinkedHashMap<String, Integer>();
		
		carsList.put("b", 2012);
		carsList.put("a", 2013);
		
		System.out.println(carsList);
	}
}
