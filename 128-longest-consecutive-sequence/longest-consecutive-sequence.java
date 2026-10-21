class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> h=new HashSet<>();

        for(int i:nums)
        h.add(i);

        int max=0;

        for(int i:h)
        {
            int count=0;
            if(!h.contains(i-1))
            {
                int start=i;
                count=1;

                while(h.contains(start+1))
                {
                    start++;
                    count++;
                }
            }
            max=Math.max(max,count);
        }
        return max;
    }
}