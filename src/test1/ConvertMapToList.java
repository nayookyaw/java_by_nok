package test1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ConvertMapToList {

	public static void main(String args[])
	{
		System.out.println("convert map to list");
		Map<Integer, String> inputMap = new HashMap<Integer, String>();
		inputMap.put(1, "Orange");
		inputMap.put(2, "Apple");
		
		ArrayList<Integer> keyArray = new ArrayList<Integer>(inputMap.keySet());
		ArrayList<String> valueArray = new ArrayList<String>(inputMap.values());
		
		System.out.println(keyArray);
		System.out.println(valueArray);
		
		System.out.println(inputMap.keySet());
		inputMap.forEach((key, value) -> {
			System.out.println(value);
		});
	}
	
}
