package test_nay;

public class TestInterface {

	public static void main(String args[])
	{
		System.out.println("program start");
		
		Machine machine = new Machine();
		machine.laptopName();
		machine.laptopYear();
		
		machine.phoneName();
	}
}

class Machine implements Laptop, Phone {
	public void laptopName() {
		System.out.println("Lap Name from Interface");
	}
	
	public Integer laptopYear() {
		System.out.println("Laptop Year");
		
		return 2018;
	}
	
	public String phoneName() {
		System.out.println("Apple Phone");
		
		return "Samsung";
	}
}

interface Laptop {
	public void laptopName();
	abstract Integer laptopYear();
}

interface Phone {
	public String phoneName();
}
