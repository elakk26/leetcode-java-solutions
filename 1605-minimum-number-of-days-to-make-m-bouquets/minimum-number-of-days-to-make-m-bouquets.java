class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        if ((long) m * k > bloomDay.length) {
            return -1;
        }
        int low = Integer.MAX_VALUE;
        int high = Integer.MIN_VALUE;
        for (int x : bloomDay) {
            low = Math.min(low, x);
            high = Math.max(high, x);
        }
        int ans = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (isValid(bloomDay, mid, m, k)) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    private boolean isValid(int[] arr, int day, int m, int k) {
        int bq = 0;
        int cnt = 0;

        for (int x : arr) {
            if (x <= day) {
                cnt++;
                if (cnt == k) {
                    bq++;
                    cnt = 0;
                }
            } else {
                cnt = 0;
            }
        }
        return bq >= m;
    }
}