package java_oop;

public class MultipleClass {
	int x = 5;
	
	public static void main(String[] args) {
		System.out.println("Main class");
		
		MultipleClass mc = new MultipleClass();
		System.out.println("multiple class x : "+ mc.x);
		
		SecondClass sc = new SecondClass();
		System.out.println("y in second class " + sc.y);
		sc.printY();
	}
}

class SecondClass {
	int y = 5;
	
	protected void printY() {
		System.out.println("Y from second class " + y);
	}
	
}
