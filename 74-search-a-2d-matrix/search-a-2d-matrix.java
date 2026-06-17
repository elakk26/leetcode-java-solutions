class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m=matrix[0].length;
        int n=matrix.length;
        int si=0;
        int li=m*n -1;
        while(si<=li)
        {
            int mid=si+(li-si)/2;
            int r=mid/m;
            int c=mid%m;
            if(matrix[r][c]==target)
            return true;

            else if(matrix[r][c]>target)
            li=mid-1;

            else
            si=mid+1;
        }
        return false;
    }
}