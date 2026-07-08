class Solution {
    public int largestRectangleArea(int[] h) {
        Stack<Integer> st = new Stack<>();
        int max = 0;
        int n = h.length;

        for (int i = 0; i <= n; i++) {
            int cur = (i == n) ? 0 : h[i];

            while (!st.isEmpty() && cur < h[st.peek()]) {
                int ht = h[st.pop()];
                int w;

                if (st.isEmpty())
                    w = i;
                else
                    w = i - st.peek() - 1;

                max = Math.max(max, ht * w);
            }
            st.push(i);
        }
        return max;
    }
}
