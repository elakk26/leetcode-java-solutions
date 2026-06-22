class Solution {
    public int maxNumberOfBalloons(String text) {
        int count=Integer.MAX_VALUE;
        text=text.toLowerCase();
        int [] freq=new int[26];
        for(char c:text.toCharArray())
        {
            freq[c-'a']++;
        }
       count=Math.min(count,freq['b'-'a']);
       count=Math.min(count,freq['a'-'a']);
       count=Math.min(count,freq['n'-'a']);

       count=Math.min(count,freq['l'-'a']/2);
       count=Math.min(count,freq['o'-'a']/2);

        return count;
    }
}