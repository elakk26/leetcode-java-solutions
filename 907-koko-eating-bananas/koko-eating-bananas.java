class Solution {
    public int minEatingSpeed(int[] piles, int ho) {
    

            int min=Integer.MAX_VALUE;
            int max=Integer.MIN_VALUE;


            for(int i:piles)
            {
                min=Math.min(i,min);
                max=Math.max(i,max);
            }


            int l=1,h=max;
            int an=0;


            while(l<=h)
            {
                int mid= l+(h-l)/2;

                if(helper(mid,ho,piles))
                {   an=mid;
                    h=mid-1;
                }
                else
                l=mid+1;

            }
            return an;
    }


    public static boolean helper(int n, int h, int[] piles)
    {
        long ans=0;

        for(int i:piles)
        {
            ans=ans+(long)Math.ceil((double)i/n);
        }

        return ans<=h ;
    }
}