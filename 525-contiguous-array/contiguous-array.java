class Solution {
    public int findMaxLength(int[] nums) {
       HashMap<Integer,Integer> h=new HashMap<>();
        h.put(0,-1);
        int pre=0;
        int len=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==0)
            pre--;
            else
            pre++;
            if(h.containsKey(pre))
            {
                len=Math.max(len,i-h.get(pre));
            }
            else
            {
                h.put(pre,i);
            }
        }
        return len;
    }
}