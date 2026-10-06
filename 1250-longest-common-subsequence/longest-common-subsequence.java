class Solution {
    public int longestCommonSubsequence(String t1, String t2) {

        Integer[][] dp=new Integer[t1.length()][t2.length()];

       return fun(t1,t2,0,0,dp); 
    }

    public static int fun(String t1,String t2, int i1,int i2,Integer dp[][])
    {
        if(i1>=t1.length()||i2>=t2.length())
        {
            return 0;
        }
        if(dp[i1][i2]!=null)
        return dp[i1][i2]; 
        
        if(t1.charAt(i1)==t2.charAt(i2))
        {
            dp[i1][i2]=1+fun(t1,t2,i1+1,i2+1,dp);
            return dp[i1][i2];
        }
        

        else
        {
            dp[i1][i2]=Math.max(fun(t1,t2,i1+1,i2,dp),fun(t1,t2,i1,i2+1,dp));
            return dp[i1][i2];
        }
    }
}