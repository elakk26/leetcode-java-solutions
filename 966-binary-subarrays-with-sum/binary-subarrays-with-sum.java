class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
     
    int a=countgoal(nums,goal-1);
    int b=countgoal(nums,goal);
return b-a;
    }
    public static int countgoal(int[] nums,int goal)
    {
          int l=0,r=0,sum=0;
        int count=0;
        if(goal<0) return 0;
        
       while(r<nums.length)
       {
        sum+=nums[r];

        while(sum>goal)
        {
            if(nums[l]==1)
            sum--;

            l++;
        }
        count=count+(r-l+1);
        r++;
       }
       return count;
    }
}