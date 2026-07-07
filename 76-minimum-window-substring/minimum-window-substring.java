class Solution {
    public String minWindow(String s, String t) {

        if(s.length()<t.length())
        return "";
        int[] freq=new int[256];
        for(char c:t.toCharArray())
        freq[c]++;

        int count=t.length();
        int start=0;
int min=Integer.MAX_VALUE;
        int l=0,r=0;
        while(r<s.length())
        {
            char c=s.charAt(r);
            if(freq[c]>0)
            {count--;
            }
            freq[c]--;
            

            while(count==0)
            {
                int len=r-l+1;
                if(len<min)
                {min=len;
                    start=l;
                }

                char d=s.charAt(l);
                freq[d]++;
                if(freq[d]>0)
                count++;

                l++;
            }
            r++;
        }
        if(min!=Integer.MAX_VALUE)
        return s.substring(start,start+min);

        else return "";
    }
}