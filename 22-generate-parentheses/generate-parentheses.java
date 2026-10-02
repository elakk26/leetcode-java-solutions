class Solution {
    static List<String> res;
    public List<String> generateParenthesis(int n) {
        res=new ArrayList<>();
        
        rec(0,0,"",n);
        return res;
    }

    public static void rec(int open,int close,String r,int n)
    {
        if(r.length()==(n*2))
        {
            res.add(r);
            return;
        }

        if(open<n)
        {
            rec(open+1,close,r+'(',n);
        }

        if(close<open)
        {
            rec(open,close+1,r+')',n);
        }
    }
}