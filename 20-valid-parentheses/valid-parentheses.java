class Solution {
    public boolean isValid(String s) {
        Stack<Character> st=new Stack<>();
        if(s.length()==1)return false;
        for(char c:s.toCharArray())
        {
            if(c=='['||c=='{'||c=='(')
            st.push(c);

            else if(st.isEmpty())
        return false;
           else if(!st.isEmpty() &&(c==')'&&st.peek()!='('))
            return false;

            else if(!st.isEmpty() &&(c=='}'&& st.peek()!='{'))
            return false;

            else if(!st.isEmpty() &&(c==']'&& st.peek()!= '['))
            return false;

            else
            {if(!st.isEmpty())
            st.pop();}

        }

        return st.isEmpty() ? true:false;
    }
}