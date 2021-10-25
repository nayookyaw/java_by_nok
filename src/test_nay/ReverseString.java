package test_nay;

public class ReverseString {

	public static void main(String args[])
	{
		System.out.println("Reverse a String");
		
		/* use String builder and reverse method */
		String input_str = "pleasereverseme";
		StringBuilder sb_str = new StringBuilder();
		sb_str.append(input_str);
		
		System.out.println(sb_str.reverse());
		
		/* use charAt method */
		String output_str = "";
		char out_ch;
		
		for (int i=0; i< input_str.length(); i++) {
			out_ch = input_str.charAt(i);
			output_str = out_ch + output_str ;
		}
		System.out.println(output_str);
		
		/* use toCharArray method */
		String out_str = "";
		char input_str_arr[] = input_str.toCharArray();
		for (int j = input_str_arr.length - 1; j >=0 ; j--) {
			out_str += input_str_arr[j];
		}
		System.out.println(out_str);
	}
}
