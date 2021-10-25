package test_nay;

public class TestAbstract {

	public static void main(String args[])
	{
		System.out.println("start program");
		
		Movement objMove = new Movement();
		System.out.println(objMove.firstMovement);
		
		objMove.carList();
		objMove.carName();
		objMove.carNumber();
		
		SecondCar secondCar = new SecondCar();
		secondCar.carList();
		secondCar.carName();
	}
}

class Movement extends Car {
	String firstMovement = "Speed";
	
	public void carList() {
		System.out.println("This is from abstract class");
	}
	
	public String carName() {
		System.out.println("This is car Name");
		
		return "BMW";
	}
}

class SecondCar extends Car {
	public void carList() {
		System.out.println("This is from second abstract class");
	}
	
	public String carName() {
		System.out.println("This is Second car Name");
		
		return "Ferrari";
	}
}

abstract class Car {
	public abstract void carList();
	protected abstract String carName();
	
	protected Integer carNumber() {
		System.out.println("Car Number");
		
		return 2019;
	}
}
