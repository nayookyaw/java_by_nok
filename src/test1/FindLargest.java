package test1;

import java.util.ArrayList;

public class FindLargest {

	public static void main(String args[])
	{
		System.out.println("program start");
		Integer inputArr[] = {0, -344, 455, 234, 456, -234, -3};
		int smallest = 0;

		for (int input: inputArr) {
			smallest = smallest < input ? smallest : input;
		}
		System.out.println(smallest);
		
		ArrayList<Integer> inputCheckArr = new ArrayList<Integer>();
		inputCheckArr.add(23);
		System.out.println(inputCheckArr.contains(22));
	}
}
