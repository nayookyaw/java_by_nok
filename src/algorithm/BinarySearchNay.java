package algorithm;

public class BinarySearchNay {

	public static void main(String args[])
	{
		System.out.println("binary search program start");
		
		int carList[] = {12,13,15,20,21};
		int searchKey = 200;
		int lastKey = carList.length - 1;
		
		BinarySearchInteger searchInt = new BinarySearchInteger();
		searchInt.searchIndex(carList, searchKey, lastKey);
		
	}
}

class BinarySearchInteger {
	protected void searchIndex(int carList[], int key, int last) {
		System.out.println(key);
		Integer first = 0;
		Integer mid = (first + last) / 2;
		
		while (first <= last) {
			System.out.println(carList[mid]);
			
			if (carList[mid] < key) {
				first = mid + 1;
			} 
			else if (carList[mid] == key) {
				System.out.println("Found Key");
				break;
			} else {
				first = mid - 1;
			}
			
			mid = (first + last) / 2;
			System.out.println("Mid " + mid);
		}
		
		if (first > last) {
			System.out.println("NOT found..");
		}
	}
}
