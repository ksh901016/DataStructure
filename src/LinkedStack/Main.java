package LinkedStack;

public class Main {

	public static void main(String[] args){
		
//		OptExp2 opt = new OptExp2();
//		int result;
//		String exp = "35*62/-";
//		System.out.printf("\n후위표기식 : %s", exp);
//		result = opt.evalPostfix(exp);
//		System.out.printf("\n 연산결과 = %d \n", result);
		
		
		Formula fo = new Formula();
		String exp2 = "{(A+B)-3}*5+[{cos(x+y)+7}-1]*4";
		if(fo.testPair(exp2))
			System.out.println("수식괄호검사 성공");;
	}
}
