class Solution {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if(root == null) return new TreeNode(val);
        if(root.left == null && root.right ==null){
            if(val > root.val) root.right = new TreeNode(val);
            else root.left = new TreeNode(val);
            return root;
        }
        if(val<root.val){
            if(root.left !=null )  insertIntoBST(root.left,val);
            else root.left = new TreeNode(val);
        }
        if(val>root.val){
            if(root.right !=null )  insertIntoBST(root.right,val);
            else root.right = new TreeNode(val);
        }
        return root;
    }
}
