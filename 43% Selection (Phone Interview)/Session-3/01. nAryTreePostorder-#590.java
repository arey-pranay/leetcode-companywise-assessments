class Solution {
    public List<Integer> postorder(Node root) {
        List<Integer> ans = new ArrayList<>();
        if(root==null) return ans;
        func(root,ans);
        return ans;
    }
    public void func(Node root , List<Integer> ans){
        if(root.children == null){
            ans.add(root.val);
            return;
        }
        for(Node n : root.children) func(n,ans);
        ans.add(root.val);
        return;
    }
}
