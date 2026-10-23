class Solution {
    public int orangesRotting(int[][] grid) {
        
            Queue<int[]> q=new LinkedList<>();

            int m=grid.length, n=grid[0].length;

            int[][] vis=new int[m][n];
            for(int[] row:vis)
            Arrays.fill(row,0);
            for(int i=0;i<m;i++)
            {
                for(int j=0;j<n;j++)
                {
                    if(grid[i][j]==2)
                    {
                        q.offer(new int[]{i,j});
                        vis[i][j]=2;
                    }
                }
            }
           // if(q.isEmpty()) return 0;
            int[] r={-1,0,1,0};
            int[] c={0,1,0,-1};
            int min=0;
            while(!q.isEmpty())
            {
                int size=q.size();

                for(int i=0;i<size;i++)
                {
                    int[] t=q.poll();
                    int cr=t[0];
                    int cc=t[1];

                    for(int k=0;k<4;k++)
                    {
                        int nr=cr+r[k];
                        int nc=cc+c[k];

                        if(nr>=0 && nr<m && nc>=0 && nc<n && grid[nr][nc]==1 && vis[nr][nc]==0)
                        {
                            q.offer(new int[]{nr,nc});
                            vis[nr][nc]=2;
                        }
                    }

                }
                 min++;
            }
                for(int i=0;i<m;i++)
                {
                    for(int j=0;j<n;j++)
                    {
                        if(grid[i][j]==1 && vis[i][j]!=2)
                        return -1;
                    }
                }
            return min==0? 0: min-1;
    }
}