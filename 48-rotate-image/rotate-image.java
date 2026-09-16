class Solution {
    public void rotate(int[][] mat) {
        
        int n=mat.length;
     for(int i=0;i<n;i++)
     {
        for(int j=i+1;j<n;j++)
        {
            int temp=mat[i][j];
            mat[i][j]=mat[j][i];
            mat[j][i]=temp;
        }
     }  


     for(int i=0;i<n;i++)
     {
        rr(i,n,mat);
     } 

     //return mat;
    }

    public static void rr(int i,int n,int[][] mat)
    {
         int index=0;
         int left=0,right=n-1;
        while(left<=right)
        {
            int temp=mat[i][left];
            mat[i][left]=mat[i][right];
            mat[i][right]=temp;
            left++;right--;
        }
    }
}