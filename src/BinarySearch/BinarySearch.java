package BinarySearch;

public class BinarySearch {
	public int B_Search(int[] a, int key) {
		int i = 0;
		int j = a.length - 1;
		int m, location;

		while (i < j) {
			m = (i + j) / 2;
			if (key > a[m]) {
				i = m + 1;
			} else {
				j = m;
			}
		}
		if (a[i] == key) {
			location = i + 1;
		} else {
			location = -1;
		}

		return location;
	}

}
