package Deque;

public class Main {

	public static void main(String[] args) {
		char deletedItem;
		DQueue DQ = new DQueue();

		DQ.insertFront('A');
		DQ.printDQueue();
		
		DQ.insertFront('B');
		DQ.printDQueue();
		
		DQ.insertRear('C');
		DQ.printDQueue();
		
		deletedItem = DQ.deletedFront();
		System.out.println("deletedItem : "+deletedItem);
		DQ.printDQueue();
		
		deletedItem = DQ.deleteRear();
		System.out.println("deletedItem : "+deletedItem);
		DQ.printDQueue();
		
		DQ.insertRear('B');
		DQ.printDQueue();
		DQ.insertRear('C');
		DQ.printDQueue();
	}

}
