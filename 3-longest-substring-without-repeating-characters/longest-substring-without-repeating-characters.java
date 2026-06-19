class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet h=new HashSet<>();

        int l=0,r=0,res=0;
        while(r<s.length())
        {
            char ch=s.charAt(r);
           
           while(h.contains(ch))
            {h.remove(s.charAt(l));
            l++;
            }
            h.add(ch);
            res=Math.max(res,r-l+1);
            r++;
        }
        return res;
    }
}