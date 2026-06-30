class Solution {
    public int numberOfSubstrings(String s) {
        int l=0,r=0;
      int[] freq=new int[3];
int count=0;
        while(r<s.length())
        {
            char ch=s.charAt(r);
            freq[ch-'a']++;
            
            while(freq[0]>0&&freq[1]>0&&freq[2]>0)
            {
               count=count+s.length()-r;

               freq[s.charAt(l)-'a']--;
               l++;
            }
            r++;
        }
        return count;
    }
}











// class Solution {
//     public int numberOfSubstrings(String s) {
//         int l=0,r=0;
//       int[] freq=new int[3];
// int count=0;
//         while(r<s.length())
//         {
//             char ch=s.charAt(r);
//             freq[ch-'a']++;
//             if(freq[0]!=0 &&freq[1]!=0 && freq[2]!=0)
//             {
//             count=count+(s.length()-r);
//             }
//             while(r==s.length()-1 && l==s.length()-1)
//             {
//                 freq[s.charAt(l)-'a']--;
//                 l++;
//                 if(freq[0]!=0 &&freq[1]!=0 && freq[2]!=0)
//                 {
//                    count=count+(s.length()-l);
//                 } 
                
//             }
//             r++;
//         }
//         return count;
//     }
// }