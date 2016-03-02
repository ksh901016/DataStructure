package LinkedStack;

public class Formula {
	/**
	 * 수식의 괄호 검사( 괄호 쌍 검사 )
	 */
	private String exp;
	private int expSize;
	private char testCh, openPair;

	public boolean testPair(String exp) {
		this.exp = exp;
		expSize = exp.length();
		LinkedStack LS = new LinkedStack();

		for (int i = 0; i < expSize; i++) {
			testCh = exp.charAt(i);

			switch (testCh) {
			
			case '(':
			case '{':
			case '[':
				LS.push(testCh);
				break;
			
			case ')':
			case '}':
			case ']':
				if(LS.isEmpty()){
					return false;
				}else{
					openPair = LS.pop();
					if((openPair==')' && testCh !='(')||
					(openPair=='}'&&testCh !='}')||
					(openPair==']'&&testCh !=']')){
						return false;
					}
				}
			}

		}
		
		if(LS.isEmpty()){
			return true;
		}else{
			return false;
		}

	}
}
