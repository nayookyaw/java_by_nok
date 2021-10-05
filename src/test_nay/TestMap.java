package test_nay;

import java.util.*;

public class TestMap {

	public static void main (String args[])
	{
		Map<String, Integer> testMap = new HashMap<String, Integer>();
		
		testMap.put("model", 1992);
		testMap.put("model", 1992);
		
		System.out.println(testMap);
		for(Map.Entry<String, Integer> testm : testMap.entrySet())
		{
			System.out.println(testm.getKey());
			System.out.println(testm.getValue());
		}
	}
}
