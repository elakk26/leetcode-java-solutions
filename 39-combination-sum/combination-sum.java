class Solution {
    List<List<Integer>> res;
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        res=new ArrayList<>();
        func(0,candidates,target,new ArrayList<>());
        return res;
    }
    public void func(int i,int[] candidates, int target,List<Integer> arrlist)
    {
        if(i==candidates.length)
        {
            if(target==0)
            res.add(new ArrayList<>(arrlist));
        
        return;
        }
        if(candidates[i]<=target){
            arrlist.add(candidates[i]);
            func(i,candidates,target-candidates[i],arrlist);
            arrlist.remove(arrlist.size()-1);
        }
        func(i+1,candidates,target,arrlist);
    }
}