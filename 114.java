//114

//a reversed preorsder travese

class Solution{
	public TreeNode prev = null;

	public void flatten(TreeNode root){
		if(root == null) return;

		flatten(root.right);
		flatten(root.left);

		root.right = prev;
		root.left = null;
		prev = root;
	}
}