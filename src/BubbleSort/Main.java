package BubbleSort;


public class Main {

	public static void main(String[] args){
		int a[] = { 52, 10, 26, 4, 16, 12, 9, 30, 7 };
		Sort s = new Sort();
		System.out.println("배열 길이 : "+a.length);
		System.out.println("\n 정렬할 원소 : ");
		for(int i=0; i<a.length; i++){
			System.out.printf(" %d", a[i]);
		}
		System.out.println();
		s.bubbleSort(a);
	}

}
