package Tree;

public class Main {

	public static void main(String[] args) {
		/** 이진탐색트리 **/
//		BinarySearchTree bsT = new BinarySearchTree();
//		bsT.insertBST('G');
//		bsT.insertBST('I');
//		bsT.insertBST('H');
//		bsT.insertBST('D');
//		bsT.insertBST('B');
//		bsT.insertBST('M');
//		bsT.insertBST('N');
//		bsT.insertBST('A');
//		bsT.insertBST('J');
//		bsT.insertBST('E');
//		bsT.insertBST('Q');
//
//		System.out.printf("\n Binary Tree >>>");
//		bsT.printBST();
//
//		System.out.printf("Is There 'A' ? >>>");
//		TreeNode p1 = bsT.searchBST('A');
//		System.out.printf("Searched Key : %c \n", p1.data);
//
//		System.out.printf("Is There 'Z' ? >>>");
//		TreeNode p2 = bsT.searchBST('Z');
//		if (p2 != null) {
//			System.out.printf("Searched Key : %c \n", p2.data);
//		}
		/** 연결 트리 (BT, 이진 트리) **/
		 LinkedTree T = new LinkedTree();
		
		 TreeNode n7 = T.makeBT(null, 'G', null);
		 TreeNode n6 = T.makeBT(null, 'F', null);
		 TreeNode n5 = T.makeBT(null, 'E', null);
		 TreeNode n4 = T.makeBT(null, 'D', null);
		 TreeNode n3 = T.makeBT(n6, 'C', n7);
		 TreeNode n2 = T.makeBT(n4, 'B', n5);
		 TreeNode n1 = T.makeBT(n2, 'A', n3);
		
		 System.out.printf("\n preorder : ");
		 T.preorder(n1);
		
		 System.out.printf("\n Inorder : ");
		 T.inorder(n1);
		
		 System.out.printf("\n postorder : ");
		 T.postorder(n1);
	}

}
