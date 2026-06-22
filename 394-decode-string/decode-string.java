class Solution {
    public String decodeString(String s) {
        Stack<String> st = new Stack<>();
        for (char ch : s.toCharArray()) {
            if (ch != ']') {
                st.push(ch + "");
            } else {
                String str = "";
                while (!st.peek().equals("[")) {
                    str = st.pop() + str;
                }
                st.pop();
                String num = "";
                while (!st.isEmpty() &&
                       Character.isDigit(st.peek().charAt(0))) {
                    num = st.pop() + num;
                }
                int k = Integer.parseInt(num);
                String temp = "";
                for (int i = 0; i < k; i++) {
                    temp += str;
                }
                st.push(temp);
            }
        }
        String ans = "";
        while (!st.isEmpty()) {
            ans = st.pop() + ans;
        }
        return ans;
    }
}