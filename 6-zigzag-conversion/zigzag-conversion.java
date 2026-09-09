class Solution {
    public String convert(String s, int numRows) {
        
        if(numRows==1)
        return s;
        String[] res=new String[numRows];

        for(int i=0;i<numRows;i++)
        res[i]="";


        int index=0;
        int n=0;
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);

            if(index==0)
            {
                n=1;
            }

            if(index==numRows-1)
            {
                n=-1;
            }
            res[index]+=c;
            index+=n;
        }
        String r="";

        for(String i:res)
        r+=i;
        return r;
    }
}