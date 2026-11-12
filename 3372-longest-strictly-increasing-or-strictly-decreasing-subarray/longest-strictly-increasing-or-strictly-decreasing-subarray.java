class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int n = nums.length;
        if (n == 0) return 0;
        
        int maxLen = 1; 

        for (int i = 0; i < n; i++) {
            int currentInc = 1;
            for (int j = i + 1; j < n; j++) {
                if (nums[j] > nums[j - 1]) {
                    currentInc++;
                } else {
                    break;
                }
            }
            maxLen = Math.max(maxLen, currentInc);
            int currentDec = 1;
            for (int j = i + 1; j < n; j++) {
                if (nums[j] < nums[j - 1]) {
                    currentDec++;
                } else {
                    break;
                }
            }
            maxLen = Math.max(maxLen, currentDec);
        }

        return maxLen;
    }
}