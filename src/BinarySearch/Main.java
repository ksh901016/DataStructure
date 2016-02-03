package BinarySearch;

public class Main {

	public static void main(String[] args){
		BinarySearch BS = new BinarySearch();
		int[] a = {1,2,6,10,75};
		int key = 6;
		
		System.out.println(BS.B_Search(a, key));
		System.out.println(a[BS.B_Search(a, key)-1]);
	}
}
