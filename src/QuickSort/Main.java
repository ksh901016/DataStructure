package QuickSort;

import SelectionSort.Sort;

public class Main {

	public static void main(String[] args) {
		int a[] = { 69, 10, 30, 2, 16, 8, 31, 22 };
		QuickSort s = new QuickSort();
		System.out.println("배열 길이 : " + a.length);
		System.out.println("\n 정렬할 원소 : ");
		for (int i = 0; i < a.length; i++) {
			System.out.printf(" %d", a[i]);
		}
		System.out.println();
		s.quickSort(a, 0, 7);
	}
}
