class Solution {
    static List<String> res;
    public List<String> generateParenthesis(int n) {
        res=new ArrayList<>();

        String cur="";
        backtrack(cur,0,0,n);
        return res;
    }

    public static void backtrack(String cur,int open,int close,int n)
    {
        if(cur.length()==2*n)
        {res.add(cur);
        return;}

        if(open<n)
        {
        backtrack(cur+'(',open+1,close,n);
        }
        if(close<open)
        {
        backtrack(cur+')',open,close+1,n);
        }
    }
}