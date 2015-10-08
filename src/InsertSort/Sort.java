package InsertSort;

public class Sort {

	public void insertionSort(int a[], int size) {
		int temp, i, j, t;

		for (i = 1; i < size; i++) {
			j = i;
			temp = a[i];
			while ((j > 0) && (a[j - 1] > temp)) {
				a[j] = a[j - 1];
				j--;
			}
			a[j] = temp;
			System.out.printf("\n 삽입정렬 %d 단계 : ", i);
			for (t = 0; t < size; t++) {
				System.out.printf("%3d", a[t]);
			}
			System.out.println();
		}
	}

}
