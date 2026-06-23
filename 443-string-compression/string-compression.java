class Solution {
    public int compress(char[] chars) {
       String s="";
       
       for(int i=0;i<chars.length;)
       {
            char current=chars[i];
            int count=0;
            while(i<chars.length &&chars[i]==current)
            {
                count++;
                i++;
            }
            if(count==1)
            s=s+current;

            else
            s=s+current+count;
       }

       for(int i=0;i<s.length();i++)
       {
        chars[i]=s.charAt(i);
       }
       return s.length();
        
    }
}