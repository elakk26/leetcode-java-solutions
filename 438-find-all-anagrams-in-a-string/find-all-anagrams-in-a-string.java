class Solution {
    public List<Integer> findAnagrams(String s1, String s2) {

        List<Integer> res=new ArrayList<>();

        if(s2.length()>s1.length())
        return res;


        int[] f1=new int[26];
        int[] f2=new int[26];

        for(int i=0;i<s2.length();i++)
        {
            f1[s2.charAt(i)-'a']++;
        }

       
        int left=0,right=0;
        
        while(right<s1.length())
        {
            char c=s1.charAt(right);
            f2[c-'a']++;

            if((right-left+1)>s2.length())
            {
                f2[s1.charAt(left)-'a']--;
                left++;
            }
            int flag=0;
            for(int i=0;i<26;i++)
            {
                if(f1[i]!=f2[i])
                {
                    flag=1;
                    break;
                }
            }

            if(flag==0)
            res.add(left);

            right++;
        }
        return res;
    }
}