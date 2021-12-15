package test_nay;

import java.util.ArrayList;

public class FindDuplicateChar {

	public static void main (String args[])
	{
		System.out.println("program start");
		
		try {
			String testStr = "keattket";
			ArrayList<Character> testList = new ArrayList<Character>();
			ArrayList<Character> outputList = new ArrayList<Character>();
			String outStr = "";
			
			for (int i=0; i< testStr.length(); i++)
			{
				char testChar = testStr.charAt(i);
				if (!testList.contains(testChar)) {
					testList.add(testStr.charAt(i));
				} else {
					if (!outputList.contains(testChar)) {
						outStr += testChar;
						outputList.add(testChar);
					}
										
				}
				
			}
			
			System.out.println("Duplicate Character " + outStr);
			
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}
}
