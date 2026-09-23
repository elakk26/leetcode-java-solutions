class Solution {
    public int compress(char[] chars) {
        if(chars.length<=1)
        return chars.length;
        StringBuilder s=new StringBuilder();
        for(int i=0;i<chars.length;)
        { 
            char c=chars[i];
            int index=i+1;
            s.append(c);
            int count=1;
            while(index<chars.length && chars[index]==c)
            {
                index++;
                count++;
            }
            if(count>1)
            s.append(count);
            i=index;
        }
        System.out.print(s);
    int in=0;
    for(in=0;in<s.length();in++)
    {
        chars[in]=s.charAt(in);
    }
    return s.length();
    }
}