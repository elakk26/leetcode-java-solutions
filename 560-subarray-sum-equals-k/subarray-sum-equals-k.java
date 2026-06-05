class Solution {
    public int subarraySum(int[] nums, int k) {

        int count=0;
        
        HashMap<Integer,Integer> h=new HashMap<>();
        h.put(0,1);
        int pre=0;
        for(int i=0;i<nums.length;i++)
        {
            pre=pre+nums[i];

                int need=pre-k;
                if(h.containsKey(need))
                {
                    count=count+h.get(need);
                }

            h.put(pre,h.getOrDefault(pre,0)+1);
        }

        return count;
    }
}