class Solution {
    public int findPeakElement(int[] arr) {
        int s=0,e=arr.length-1,mid;
        while(s<e)
        {
            mid=(s+e)/2;
            if(arr[mid]<arr[mid+1])
            s=mid+1;
            if(arr[mid]>arr[mid+1])
            e=mid;

        }
        return s;
    }
}