package Tree;

public class BinarySearchTree {

	// root는 클래스 변수
	private TreeNode root = new TreeNode();

	// 키 삽입
	public TreeNode insertKey(TreeNode root, char x) {
		// p는 항상 root Node를 가리키고 있다.
		//root에서 항상 출발
		TreeNode p = root;
		TreeNode newNode = new TreeNode();
		newNode.data = x;
		newNode.left = null;
		newNode.right = null;
		if (p == null)
			return newNode;
		else if (newNode.data < p.data) {
			p.left = insertKey(p.left, x);
			return p;
		} else if (newNode.data > p.data) {
			p.right = insertKey(p.right, x);
			return p;
		} else
			return p;
	}

	public void insertBST(char x) {
		root = insertKey(root, x);
	}

	public TreeNode searchBST(char x) {
		TreeNode p = root;
		while (p != null) {
			if (x > p.data) {
				p = p.right;
			} else if (x < p.data) {
				p = p.left;
			} else {
				return p;
			}
		}
		return p;
	}
	
	public void inorder(TreeNode root){
		if(root!=null){
			inorder(root.left);
			System.out.printf(" %c", root.data);
			inorder(root.right);
		}
	}
	
	public void printBST(){
		inorder(root);
		System.out.println();
	}
}
