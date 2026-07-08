class Solution {
    List<List<Integer>> res;

    public List<List<Integer>> permute(int[] nums) {
        
        res=new ArrayList<>();
        
        List<Integer> l=new ArrayList<>();
        boolean vis[]=new boolean[nums.length];

        permutation(nums,l,vis);
        return res;
    }

    public void permutation(int[] nums,List<Integer> l,boolean[] vis)
    {
        if(l.size()==nums.length)
        {
            res.add(new ArrayList<>(l));
            return;
        }

        for(int i=0;i<nums.length;i++)
        {
            if(vis[i])
            continue;

            else
            {
                l.add(nums[i]);
                vis[i]=true;
                permutation(nums,l,vis);
                l.remove(l.size()-1);
                vis[i]=false;
            }

        }
    }
}