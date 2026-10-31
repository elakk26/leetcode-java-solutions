class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> h=new HashSet<>();

        int l=0,r=0,max=0;


        while(r<s.length())
        {
           
            while(h.contains(s.charAt(r)))
            {
                h.remove(s.charAt(l));
                l++;
            }
             h.add(s.charAt(r));
            max=Math.max(max,r-l+1);
            r++;

        }
        return max;
    }
}