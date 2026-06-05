class Solution {
    public int maxValue(int n, int index, int maxSum) {
        int l = 1;
        int r = maxSum;
        int ans = 1;
        while (l <= r) {
            int m = l + (r - l) / 2;

            long sum = m;
            sum += find(m, index);
            sum += find(m, n - index - 1);

            if (sum <= maxSum) {
                ans = m;
                l = m + 1;
            } else {
                r = m - 1;
            }
        }

        return ans;
    }
    long find(long x, long c) {
        if (x > c) {
            long a = x - 1;
            long b = x - c;
            return (a + b) * c / 2;
        }
        long s = (x - 1) * x / 2;
        long one = c - (x - 1);
        return s + one;
    }
}