package SelectionSort;

public class Sort {

	public void selectionSort(int a[]) {
		int i, j, min;

		for (i = 0; i < a.length - 1; i++) {
			min = i;
			for (j = i + 1; j < a.length; j++) {
				if (a[j] < a[min]) {
					min = j;
				}
			}
			swap(a, min, i);
			System.out.printf("\n선택정렬  %d 단계: ", i + 1);
			for (j = 0; j < a.length - 1; j++) {
				System.out.printf("%3d", a[j]);
			}
		}

	}

	public void swap(int a[], int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

}
