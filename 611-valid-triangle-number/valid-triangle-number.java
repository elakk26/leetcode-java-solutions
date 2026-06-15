class Solution {
    public int triangleNumber(int[] nums) {
        Arrays.sort(nums);

        int count=0;
        int i,j;
        for(int k=nums.length-1;k>=2;k--)
        {
            i=0;j=k-1;

            while(i<j)
            {
                if(nums[i]+nums[j]>nums[k])
                {
                    count+=j-i;
                    j--;
                }

                else
                i++;

            }
        }

        return count;
    }
}