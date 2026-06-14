class Solution {
    List<List<String>> res ;
    public List<List<String>> partition(String s) {
        res= new ArrayList<>();
        backtrack(0, s, new ArrayList<>());
        return res;
    }
    void backtrack(int start, String s, List<String> cur) {
        if (start == s.length()) {
            res.add(new ArrayList<>(cur));
            return;
        }
        for (int end = start; end < s.length(); end++) {
            if (isPalindrome(s, start, end)) {
                cur.add(s.substring(start, end + 1));
                backtrack(end + 1, s, cur);
                cur.remove(cur.size() - 1);
            }
        }
    }
    boolean isPalindrome(String s, int l, int r) {
        while (l < r) {
            if (s.charAt(l) != s.charAt(r))
                return false;
            l++;
            r--;
        }
        return true;
    }
}