class Solution {
    static HashMap<Character,String> map;
    static List<String> res;
    public List<String> letterCombinations(String digits) {
        map=new HashMap<>();
        res=new ArrayList<>();
        int n=digits.length();
        if(n==0) return res;
        map.put('2',"abc");
        map.put('3',"def");
        map.put('4',"ghi");
        map.put('5',"jkl");
        map.put('6',"mno");
        map.put('7',"pqrs");
        map.put('8',"tuv");
        map.put('9',"wxyz");
        backtrack(digits,new StringBuilder(),0);
        return res;
    }
    static void backtrack(String digits,StringBuilder path, int i)
    {
        if(i==digits.length())
        {
            res.add(path.toString());
            return;
        }
        String x=map.get(digits.charAt(i));
        for(char j:x.toCharArray())
        {
            path.append(j);
            backtrack(digits,path,i+1);
            path.deleteCharAt(path.length()-1);
        }
    }
}