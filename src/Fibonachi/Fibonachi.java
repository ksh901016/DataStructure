package Fibonachi;

public class Fibonachi {
	public static void main(String[] args){
		fibonachi_1();
		
	}
	
	private static void fibonachi_1(){
		int i = 0;
		int j = 1;
		int sum = 0;
		
		for(int k = 0; k < 15; k++){
			i = j;
			j = sum;
			sum = i + j;
			System.out.print(" "+sum);
		}
	}
	
	private static void fibonachi_2(){
		
	}
}
