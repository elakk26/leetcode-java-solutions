
class Solution {
    static List<Integer> res;
    public List<Integer> preorderTraversal(TreeNode root) {
     res=new ArrayList<>();

     dfs(root);
     return res;   
    }

    public static void dfs(TreeNode root)
    {
        if(root==null)
        return;
        res.add(root.val);
        dfs(root.left);
        dfs(root.right);
    }
}