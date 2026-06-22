class Solution {
    public int rearrangeCharacters(String s, String target) {
        int[] freq=new int[26];
        int[] f1=new int[26];

        for(char c:target.toCharArray())
         f1[c -'a']++;
        for(char i:s.toCharArray())
        {
            freq[i-'a']++;
        }
        int count=Integer.MAX_VALUE;
        for(int i=0;i<26;i++)
        {
            if(f1[i] > 0) 
                count = Math.min(count, freq[i] / f1[i]);
        }
        return count;
    }
}