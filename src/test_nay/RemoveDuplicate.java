package test_nay;

import java.util.ArrayList;

public class RemoveDuplicate {

	public static void main (String [] args)
	{
		String input_str = "tesssseesss";
		
		String out_str = removeDupl(input_str);
		System.out.println(out_str);
	}
	
	private static String removeDupl(String input)
	{		
		char [] char_arr = input.toCharArray();
		ArrayList<Character> new_arr = new ArrayList<Character>();
		
		for (char val : char_arr)
		{
			if (!new_arr.contains(val)) {
				new_arr.add(val);
			}
		}
		
		StringBuilder new_str = new StringBuilder();
		
		for (char new_val : new_arr)
		{
			new_str.append(new_val);
		}
		
		return new_str.toString();
	}
}
