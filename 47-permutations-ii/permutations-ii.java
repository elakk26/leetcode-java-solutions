class Solution {
    static Set<List<Integer>> res;
    public List<List<Integer>> permuteUnique(int[] nums) {
        res=new HashSet<>();
        List<Integer> l=new ArrayList<>();
        boolean[] vis=new boolean[nums.length];
        for(int i=0;i<nums.length;i++)
        vis[i]=false;
        backtrack(vis,nums,l);
        return new ArrayList<>(res);
    }

    public static void backtrack(boolean[] vis, int[] nums, List<Integer> l)
    {
        if(l.size() ==nums.length)
        {
             res.add(new ArrayList<>(l));
             return;}

        for(int i=0;i<nums.length;i++)
       {  if(!vis[i])
         {     vis[i]=true;
               l.add(nums[i]);
               backtrack(vis,nums,l);
               l.remove(l.size()-1);
               vis[i]=false;
         }
       }
    }
}