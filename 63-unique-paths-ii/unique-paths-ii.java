class Solution {
    public int uniquePathsWithObstacles(int[][] og) {
        
        if(og[0][0]==1) return 0;

        int m=og.length;
        int n=og[0].length;

        int res[][]=new int[m][n];
        res[0][0]=1;
        for (int i=1;i<n;i++)
        {
            if(og[0][i]!=1)
            res[0][i]=res[0][i-1];
        }
        for(int i=1;i<m;i++)
        {
            if(og[i][0]==0)
            res[i][0]=res[i-1][0];
        }
        for(int i=1;i<m;i++)
        {
            for(int j=1;j<n;j++)
            {
                if(og[i][j]!=1)
                res[i][j]=res[i-1][j]+res[i][j-1];
            }
        }
        return res[m-1][n-1];
    }
}