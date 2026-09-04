class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low=1,high=0;

        for(int i:piles)
        {
            high=Math.max(high,i);
            
        }
        int ans=0;
        while(low<=high)
        {
            int mid=low+(high-low)/2;

            if(findmin(mid,piles,h))
            {
                ans=mid;            
                high=mid-1;
            }

            else
            low=mid+1;
        }

        return ans;
    }

    public static boolean findmin(int s,int[] arr,int g)
    {
        long time=0;

        for(int i:arr)
        {
            time=time+(int)Math.ceil((double)i/s);
        }
        return time<=g;
    }
}