class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int[][] dp=new int[text1.length()][text2.length()];
        for(int i=0;i<text1.length();i++)
        {
            Arrays.fill(dp[i],-1);
        }
        return fun(text1,text2,0,0,dp);
    }

    public static int fun(String s1,String s2, int i1,int i2,int[][] dp)
    {
        if(i1>=s1.length() || i2>=s2.length())
        return 0;

        if(dp[i1][i2]!=-1)
        return dp[i1][i2];
        if(s1.charAt(i1)==s2.charAt(i2))
        {
            return dp[i1][i2]=1+fun(s1,s2,i1+1,i2+1,dp);
        }
        else
        return dp[i1][i2]= Math.max(fun(s1,s2,i1+1,i2,dp),fun(s1,s2,i1,i2+1,dp));
    }

}