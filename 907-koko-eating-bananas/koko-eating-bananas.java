class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int l=1;
        int max=0;
        for(int i=0;i<piles.length;i++)
        {
            max=Math.max(piles[i],max);
        }
        int r=max,mid=0;

        while(l<=r)
        {
            mid=(l+r)/2;

            int t=0;
            for(int i=0;i<piles.length;i++)
            {
                t+=Math.ceil((double)piles[i]/mid);
            }

            if(t>h)
            l=mid+1;

            else
            r=mid-1;
        }

        return l;
    }
}