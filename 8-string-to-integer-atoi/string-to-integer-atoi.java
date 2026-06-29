class Solution {
    public int myAtoi(String s) {
        s = s.trim();
        
        if (s.isEmpty()) return 0;

        long res = 0;
        int flag = 1;
        int i = 0;

        if (s.charAt(0) == '-') {
            flag = -1;
            i++;
        } else if (s.charAt(0) == '+') {
            i++;
        }

        for (; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isDigit(c)) {
                res = res * 10 + (c - '0');
                if (flag == 1 && res > Integer.MAX_VALUE) {
                    return Integer.MAX_VALUE;
                }
                if (flag == -1 && (res * -1) < Integer.MIN_VALUE) {
                    return Integer.MIN_VALUE;
                }
            } else {
                break;
            }
        }
        return (int) res * flag;
    }
}
