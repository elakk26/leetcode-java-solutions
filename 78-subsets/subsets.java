class Solution {
   static List<List<Integer>> res;
    public List<List<Integer>> subsets(int[] nums) {
    res=new ArrayList<>();
    List<Integer> l=new ArrayList<>();
    rec(0,nums,l);
    return res;
    }

    public static void rec(int i,int[] nums,List<Integer> l)
    {
        if(i==nums.length)
        {res.add(new ArrayList<>(l));
        return;}

        l.add(nums[i]);
        rec(i+1,nums,l);

        l.remove(l.size()-1);
        rec(i+1,nums,l);
    }
}