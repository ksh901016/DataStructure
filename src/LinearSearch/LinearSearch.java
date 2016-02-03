package LinearSearch;

public class LinearSearch {
	
	public int Search(int a[],int key){
		int location = -1;
		int i = 0;
		if(a[i] == key){
			location = i;
			return location;
		}
		while(i<a.length && a[i]!= key){
			i ++;
			if( a[i] == key){
				location = i;
			}
		}
		return location;
	}

}
