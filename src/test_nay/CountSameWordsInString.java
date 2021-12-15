package test_nay;

import java.util.HashMap;

public class CountSameWordsInString {
	
	public static void main(String args[])
	{
		System.out.println("Program start");
		
		String inputStr = "tessster";
		HashMap<String, Integer> sameWordHash = new HashMap<String, Integer>();
		
		System.out.println("Before processing - " + inputStr);
		for(int i = 0; i < inputStr.length(); i++) {
			System.out.println(inputStr.charAt(i));
			
			Character keyStr = inputStr.charAt(i);
			if (sameWordHash.containsKey(keyStr.toString())) {
				Integer count = sameWordHash.get(keyStr.toString());
				
				sameWordHash.put(keyStr.toString(), count + 1);
			} else {
				sameWordHash.put(keyStr.toString(), 1);
			}
		}
		
		System.out.println(sameWordHash);
	}
}
