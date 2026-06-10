class Solution {
    public String convert(String s,int n) {

        if(n==1) return s;

        char[][] c=new char[n][s.length()];

        int si=0;
        int col=0;

        while(si<s.length())
        {
            for(int r=0;r<n&&si<s.length();r++)
            {
                c[r][col]=s.charAt(si++);
            }

            col++;
            for(int r=n-2;r>=1&&si<s.length();r--)
            {
                c[r][col]=s.charAt(si++);
                col++;
            }
        }

        String res="";
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<s.length();j++)
            {
                if(c[i][j]!='\0')
                {
                    res+=c[i][j];
                }
            }
        }

        return res;
    }
}