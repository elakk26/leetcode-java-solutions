/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
      List<List<Integer >> res=new ArrayList<>();
        if(root==null) return res;
      Queue<TreeNode> q=new LinkedList<>();
      q.add(root);
        int count=q.size();
        List<Integer> l=new ArrayList<>();
      while(!q.isEmpty())
      {
        int levsize=q.size();
        l=new ArrayList<>();
        for(int i=0;i<levsize;i++)
        {
            TreeNode curr=q.poll();
            l.add(curr.val);
            if(curr.left !=null)
            q.offer(curr.left);

            if(curr.right!=null)
            q.offer(curr.right);
        }
        res.add(l);
      }
      System.out.println(l);
      return res;
    }
}