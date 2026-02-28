/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        
        // Base case
        if (root == null || root == p || root == q) {
            return root;
        }

        // Search left and right
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);

        // If both sides are not null, root is LCA
        if (left != null && right != null) {
            return root;
        }

        // Otherwise return the non-null child
        return (left != null) ? left : right;
    }
    // public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
    //     ArrayList<TreeNode> path1 = new ArrayList<>();
    //     ArrayList<TreeNode> path2 = new ArrayList<>();
    //     findPath(root,p.val,path1);
    //     findPath(root,q.val,path2);
    //     TreeNode lca = root;
    //     for(int i=0;i<Math.min(path1.size(), path2.size()) ; i++){
    //         if(path1.get(i) != path2.get(i)) break;
    //         lca = path1.get(i);
    //     }
    //     return lca;
    // }
    // public boolean findPath(TreeNode root,int target,ArrayList<TreeNode> path){
    //     if(root==null) return false;
    //     TreeNode curr = root;
    //     path.add(curr);
    //     if(curr.val==target){
    //         return true;
    //     }
    //     if(findPath(root.left, target, path) || findPath(root.right, target, path)) return true;
    //     path.remove(path.size()-1);
    //     return false;
    // }
}
