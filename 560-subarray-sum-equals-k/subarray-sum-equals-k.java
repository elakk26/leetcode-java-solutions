class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> h=new HashMap<>();
        int total=0;
        h.put(total,1);
        int count=0;
        for(int i=0;i<nums.length;i++)
        {
            total+=nums[i];
            int pre=total-k;
            if(h.containsKey(pre))
            count+=h.get(pre);

            h.put(total,h.getOrDefault(total,0)+1);
        }

        return count;
    }
}