package test_nay;

import java.util.ArrayList;
import java.util.List;

public class MultipleDataTypeArrayList {

	public static void main (String args[])
	{
		List<Object> newObj = new ArrayList<Object>();
		newObj.add("This is");
		newObj.add(12);
		newObj.add("years");
		newObj.add(120L);
		
		for (Object obj : newObj) {
			System.out.println(obj);
		}
		
	}
}
