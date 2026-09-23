class Solution {
    public String decodeString(String s) {
        Stack<String> st=new Stack<>();
        Stack<Integer> stn=new Stack<>();

    int k=0;
    String cur="";
        for(char c:s.toCharArray())
        {
            if(Character.isDigit(c))
            {
                k=k*10 +(c-'0');
            }
           else if(c=='[')
           {
            stn.push(k);
            k=0;
            st.push(c+"");
           }

           else if(c==']')
           {
            String temp="";
            while(!st.isEmpty()&& !st.peek().equals("["))
                temp=st.pop()+temp;

            st.pop();
            int count=stn.pop();
            String dub="";
            for(int i=0;i<count;i++)
            {
            dub+=temp;
            }
            st.push(dub);
           }

           else
           st.push(c+"");
        }
        String result = "";
        while (!st.isEmpty()) {
            result = st.pop() + result;
        }

        return result;
    }
}