package MergeTwoBinaryTrees;

public class Solution {
	
	public static TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
		return null;
    }
	
	// µ›πÈ÷––Ú±È¿˙
	public static void InOrder (TreeNode t) {
		System.out.println(t.val);
		if (t.left != null) InOrder(t.left);
		if (t.right != null) InOrder(t.right);
	}
	
	public static void main(String[] args) {
		TreeNode t1 = new TreeNode(1);
		t1.left = new TreeNode(3);
		t1.right = new TreeNode(2);
		t1.left.left = new TreeNode(5);
		
		TreeNode t2 = new TreeNode(2);
		t2.left = new TreeNode(1);
		t2.right = new TreeNode(3);
		t2.left.right = new TreeNode(4);
		t2.right.right = new TreeNode(7);
		InOrder(t2);
	}

}
