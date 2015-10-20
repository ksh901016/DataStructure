package LinkedStack;

public class Main {

	public static void main(String[] args){
		
		OptExp opt = new OptExp();
		String exp = "(3*5)-(6/2)";
		char postfix[];
		int value;
		System.out.println(exp);
		if(opt.testPair(exp))
			System.out.println("괄호 맞음!");
		else
			System.out.println("괄호 틀림!!!");
		
		
		System.out.println("\n후위 표기식 : ");
		postfix = opt.toPostfix(exp);
		System.out.println(postfix);
//		char deletedItem;
//		LinkedStack LS = new LinkedStack();
//		
//		LS.push('A');
//		LS.printStack();
//		
//		LS.push('B');
//		LS.printStack();
//		
//		LS.push('C');
//		LS.printStack();
//		
//		deletedItem = LS.pop();
//		if(deletedItem !=0){
//			System.out.println("deleted Item : "+ deletedItem);
//		}
//		LS.printStack();
	}
}
