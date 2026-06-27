class Solution {
   static List<List<Integer>>res;
    public List<List<Integer>> subsets(int[] nums) {
        res=new ArrayList<>();

        subset(0,new ArrayList<>(),nums);
        return res;
    }

    public static void subset(int i, List<Integer> l,int[] arr)
    {
        if(i==arr.length)
        {
            res.add(new ArrayList<>(l));
            return;
        }
        l.add(arr[i]);
        //res.add(new ArrayList<>(l));
        subset(i+1,l,arr);
        l.remove(l.size()-1);
        subset(i+1,l,arr);
    }
}