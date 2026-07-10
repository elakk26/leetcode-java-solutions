class Solution {
    public String licenseKeyFormatting(String s, int k) {
        
       
        StringBuilder s1=new StringBuilder();
        int count=0;
        for(char c:s.toCharArray())
        {
            if(c!='-')
            s1.append(Character.toUpperCase(c));
            
            else
            count++;
        }
         if(k>s1.length()|| s1.length()==0)
        return s1.toString();
StringBuilder res=new StringBuilder();
        if(s1.length()%k !=0)
       { res.append(s1.substring(0,s1.length()%k));
       res.append('-');
       }

        for(int i=s1.length()%k;i<s1.length()-k+1;)
        {
            res.append(s1.substring(i,i+k));
            res.append('-');
            i+=k;
        }

        System.out.println(res);

        return res.substring(0,res.length()-1).toString();
    }
}