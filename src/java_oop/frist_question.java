package java_oop;
import java.util.*;

public class frist_question {
	
	public static void main(String[] args)
	{
		System.out.println("Start program");
		String input = "tesss";
		
		String out_str = removeDup(input);
		System.out.println(out_str);
	}
	
	private static String removeDup(String input_str)
	{
		// convert string to character array
		char [] char_arr = input_str.toCharArray();
		
		// put arraylist absent character
		ArrayList<Character> new_char_arr = new ArrayList<Character>();
		
		for (char val: char_arr)
		{
			if(!new_char_arr.contains(val)) {
				new_char_arr.add(val);
			}
		}
		
		StringBuilder str_out = new StringBuilder(new_char_arr.size());
		for (char val: new_char_arr)
		{
			str_out.append(val);
		}
		
		return str_out.toString();
	}
}
