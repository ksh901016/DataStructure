package LinkedStack;

public class OptExp {
	private String exp;
	private int expsize;
	private char testCh, openPair;

	public boolean testPair(String exp) {
		this.exp = exp;
		LinkedStack S = new LinkedStack();
		expsize = this.exp.length();
		for (int i = 0; i < expsize; i++) {
			testCh = exp.charAt(i);
			switch (testCh) {
			case '(':
			case '{':
			case '[':
				S.push(testCh);
				break;
			case ')':
			case '}':
			case ']':
				if (S.isEmpty())
					return false;
				else {
					openPair = S.pop();
					if ((openPair == '(' && testCh != ')')
							|| (openPair == '{' && testCh != '}')
							|| (openPair == '[' && testCh != ']'))
						return false;
					else
						break;
				}
			}
		}
		if (S.isEmpty())
			return true;
		else
			return false;
	}

	public char[] toPostfix(String infix) {
		char testCh;
		exp = infix;
		int expSize = 10;
		int j = 0;
		char postfix[] = new char[expsize];
		LinkedStack S = new LinkedStack();
		
		for(int i=0; i<=expSize; i++){
			testCh = exp.charAt(i);
			switch(testCh){
			case '0':
			case '1':
			case '2':
			case '3':
			case '4':
			case '5':
			case '6':
			case '7':
			case '8':
			case '9':
				postfix[j++] = testCh;
				break;
			case '+':
			case '-':
			case '*':
			case '/':
				S.push(testCh);
				break;
			case ')':
				postfix[j++] = S.pop();
				break;
			}
		}
		
		postfix[j] = S.pop();
		return postfix;
	}
}
