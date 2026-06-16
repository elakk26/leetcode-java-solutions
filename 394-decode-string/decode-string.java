class Solution {
    public String decodeString(String s) {
        Stack<Integer> count=new Stack<>();
        Stack<String> str=new Stack<>();
        String ans="";
        int num=0;
        for(char ch:s.toCharArray())
        {
            if(ch>='0'&&ch<='9')
            {
                num=num*10+(ch-'0');
            }
            else if(ch=='[')
            {
                count.push(num);
                str.push(ans);
                num=0;
                ans="";
            }
            else if(ch>='a'&&ch<='z')
            {
                ans+=ch;
            }
            else if(ch==']')
            {
                int times=count.pop();
                String old=str.pop();
                String temp="";
                for(int i=0;i<times;i++)
                {
                    temp+=ans;
                }
                ans=old+temp;
            }
        }
        return ans;
    }
}