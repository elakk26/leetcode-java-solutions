class Solution {
    public int compress(char[] chars) {
       StringBuilder s=new StringBuilder();
       
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
            s.append(current);

            else
            s.append(current).append(count);
       }

       for(int i=0;i<s.length();i++)
       {
        chars[i]=s.charAt(i);
       }
       return s.length();
        
    }
}