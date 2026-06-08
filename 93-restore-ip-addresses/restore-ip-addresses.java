class Solution {
    List<String> a=new ArrayList<>();
    public List<String> restoreIpAddresses(String s) {
        fun(s,0,0,"");
        return a;
    }
    void fun(String s,int i,int p,String t)
    {
        if(p==4&&i==s.length())
        {
            a.add(t.substring(0,t.length()-1));
            return;
        }
        if(p==4||i==s.length()) return;
        for(int j=1;j<=3&&i+j<=s.length();j++)
        {
            String x=s.substring(i,i+j);
            if(x.length()>1&&x.charAt(0)=='0') continue;
            int n=Integer.parseInt(x);
            if(n<=255)
            {
                fun(s,i+j,p+1,t+x+".");
            }
        }
    }
}