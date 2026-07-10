class Solution {
    public int subarraySum(int[] nums, int k) {
     HashMap<Integer,Integer> h=new HashMap<>();
     h.put(0,1);  
     int sum=0;
     int count=0;
     for(int i=0;i<nums.length;i++)
     {
        sum=sum+nums[i];
        int rem=sum -k;
        // if(sum==k)
        // count++;
        if(h.containsKey(rem))
        count=count+h.get(rem);

        h.put(sum,h.getOrDefault(sum,0)+1);
     } 
        return count;
    }
}