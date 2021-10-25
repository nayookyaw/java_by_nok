package test_nay;

import java.util.*;

public class TestMap {

	public static void main (String args[])
	{
		Map<String, String> carList = new HashMap<String, String>();
		
		carList.put("germany", "BMW");
		carList.put("italy", "Ferrari");
		
		for (Map.Entry<String, String> car : carList.entrySet())
		{
			System.out.println(car.getValue());
		}
		
		System.out.println(carList.get("italy"));
	}
}
