package java_oop;

import java.util.ArrayList;

public class IteratorArrayListAndMap {

	public static void main(String args[]) 
	{
		System.out.println("start program");
		
		ArrayList<String> cars = new ArrayList<String>();
		cars.add("BMW");
		cars.add("Ford");
		cars.add("Ford");
		
		System.out.println(cars.get(2));
		
		String test = "testtt";
		ArrayList<Character> testArrList = new ArrayList<Character>();
		String testStr = "";
		
		char testArr[] = test.toCharArray();
		for (int i = 0; i< testArr.length; i++)
		{
			if (!testArrList.contains(testArr[i])) {
				testArrList.add(testArr[i]);
				
				Character temp = testArr[i];
				
				testStr += temp.toString();
			}
			
		}
		
		System.out.println(testArrList);
		System.out.println(testStr);
		
		String phraseTest = "This is this ha ha";
		System.out.println(phraseTest);
		
		String splitStr[] = phraseTest.split(" ");
		
		ArrayList<String> secondArr = new ArrayList<String>();
		StringBuilder secondStrBuilder = new StringBuilder();
		
		for (int j = 0; j< splitStr.length; j++)
		{
			if (!secondArr.contains(splitStr[j])) {
				secondArr.add(splitStr[j]);
				
				secondStrBuilder.append(splitStr[j] + " ");
			}
		}
		System.out.println(secondArr);
		System.out.println(secondStrBuilder);
	}
}
