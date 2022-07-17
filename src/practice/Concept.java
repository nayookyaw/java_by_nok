package practice;

public class Concept extends Manupulation {
	public static void main(String args[])
	{
		System.out.println("program start");
		
		Manupulation manu = new Manupulation();
		manu.add();
		manu.add(3);
	}
}

class Manupulation {
	public void add() {
		System.out.println("Add in Manupulation");
	}
	
	public void add(Integer a) {
		System.out.println("second add" + a.toString());
	}
}
