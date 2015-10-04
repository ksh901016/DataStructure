package BubbleSort;

public class Sort {

	public void bubbleSort(int a[]) {
		int i, j, size;
		size = a.length;

		for (i = size - 1; i > 0; i--) {
			System.out.printf("\n버블 정렬 %d 단계 : ", size - i);
			for (j = 0; j < i; j++) {
				if (a[j] > a[j + 1]) {
					swap(a, j, j + 1);
				}
				System.out.printf("\n\t");
				for (int k = 0; k < size; k++) {
					System.out.printf("%4d ", a[k]);
				}
			}
		}

	}

	public void swap(int a[], int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

}
