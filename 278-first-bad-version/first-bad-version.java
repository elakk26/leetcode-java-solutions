/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        
    int l=1,r=n;
    int mid=0;
    int left=0;

    while(l<=r)
    {
        mid=l+(r-l)/2;

        if(isBadVersion(mid))
        {
            left=mid;
            r=mid-1;
        }

       else
        l=mid+1;
    }
    return left;

    }
}