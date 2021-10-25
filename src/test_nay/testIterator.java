package test_nay;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class testIterator {

	public static void main(String args[])
	{
		System.out.println("program start");
		
		List<String> carList = new ArrayList<String>();
		
		carList.add("BMW");
		carList.add("Ferrari");
		
		Iterator<String> carLoop = carList.iterator();
//		System.out.println(carLoop.next());
		
		while (carLoop.hasNext()) {
			System.out.println(carLoop.next());
		}
		
	}
}
