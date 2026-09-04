class Solution {
    public int[] findErrorNums(int[] nums) {
        HashSet<Integer> h=new HashSet<>();
        int[] r=new int[2];
        for(int i:nums)
        {
            if(h.contains(i))
            {
                r[0]=i;
            }
            h.add(i);
        }
        for(int i=1;i<=nums.length;i++)
        {
            if(!h.contains(i))
            {
                r[1]=i;
                break;
            }
        }
        return r;
    }
}