class Solution {
    public boolean isPerfectSquare(int n) {
        if(n==1) return true;

        if(n==0) return true;
        int l=1,r=n/2;

        while(l<=r)
        {
            int mid=l+(r-l)/2;
            long s=(long)mid*mid;

            if(s==n)
            return true;


            else if(s>n)
            r=mid-1;

            else
            l=mid+1;

        }
        return false;
    }
}