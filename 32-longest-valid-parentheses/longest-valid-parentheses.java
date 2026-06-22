class Solution {
    public int longestValidParentheses(String s) {
        Stack<Integer> st=new Stack<>();
        st.push(-1);
        int max=0;
        for(int j=0;j<s.length();j++)
        {   char i=s.charAt(j);
            if(i=='(')
            st.push(j);

            else
            {
                st.pop();
                if(st.isEmpty())
                st.push(j);
                else
                max=Math.max(max,j-st.peek());
            }
        }
    return max;
    }
}