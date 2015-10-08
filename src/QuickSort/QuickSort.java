package QuickSort;

public class QuickSort {

	int i =0;
	
	public void quickSort(int a[], int begin, int end) {
		if(begin<end){
			int p;
			p = partition(a,begin,end);
			quickSort(a,begin,p-1);
			quickSort(a,p+1,end);
		}

	}

	public int partition(int a[], int begin, int end) {
		int pivot, temp, L, R, t;
		
		L = begin;
		R = end;
		pivot = (begin+end)/2;
		
		System.out.printf("\n [퀵정렬 %d 단계 : pivot = %d ] \n", ++i,a[pivot]);
		while(L<R){
			while((L<R) && (a[L]<a[pivot])) L++;
			while((L<R) && (a[R]>=a[pivot])) R--;
			if(L<R){
				temp = a[L];
				a[L] = a[R];
				a[R] = temp;
			}
		}
		
		temp = a[pivot];
		a[pivot] = a[R];
		a[R] = temp;
		for(t=0; t<a.length ; t++){
			System.out.printf("%3d", a[t]);
		}
		System.out.println();

		return L;
	}

}
