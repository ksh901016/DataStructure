package LinkedList;

public class LinkedList {

	private ListNode head;

	public LinkedList() {
		head = null;
	}

//	// 첫번째 삽입
//	public void insertFirstNode(String data) {
//		ListNode newNode = new ListNode(data);
//		if (head == null) {
//			this.head = newNode;
//		}else{
//			newNode.link = head.link;
//			head.link = newNode;
//		}
//	}
//	
	//중간 삽입
	public void insertMiddleNode(ListNode pre, String data){
		ListNode newNode = new ListNode(data);
		newNode.link = pre.link;
		pre.link = newNode;
	}
	
	//마지막 삽입
	public void insertLastNode(String data){
		ListNode newNode = new ListNode(data);
		if(head == null){
			this.head = newNode;
		}else{
			ListNode temp = head;
			while(temp.link != null){
				temp = temp.link;
			}
			temp.link = newNode;
		}
	}
	
	//마지막 원소 삭제
	public void deleteLastNode(){
		ListNode pre, temp;
		if(head ==null) return;
		if(head.link ==null) {
			head = null;
		}
		else{
			pre = head;
			temp = head.link;
			while(temp.link!=null){
				pre = temp;
				temp = temp.link;
			}
			pre.link = null;
		}
		
	}
	
	//원소검색
	public ListNode searchNode(String data){
		ListNode temp = this.head;
		while(temp!=null){
			if(data.equals(temp.getData())){
				return temp;
			}else{
				temp = temp.link;
			}
		}
		return temp;
	}
	
	public void printList(){
		ListNode temp = this.head;
		System.out.printf("L = (");
		while(temp!= null){
			System.out.printf(temp.getData());
			temp = temp.link;
			if(temp != null){
				System.out.printf(", ");
			}
		}
		System.out.printf(")");
	}
	

	@Override
	public String toString() {
		return "LinkedList [head=" + head + "]";
	}
	
	

}
