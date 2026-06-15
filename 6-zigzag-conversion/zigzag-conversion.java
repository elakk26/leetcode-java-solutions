class Solution {
    public String convert(String s, int numRows) {
        
        if( numRows==1)
        return s;


        String[] row=new String[numRows];
        for(int i=0;i<numRows;i++)
        row[i]="";

        int ind=0;
        int d=1;
        for(char c:s.toCharArray())
        {
                row[ind]+=c;

                if(ind==0)
                d=1;

                else if(ind==numRows-1)
                {
                    d=-1;
                }
                ind+=d;
        }
        String res="";
        for(String i:row)
        res+=i;

        return res;

    }
}