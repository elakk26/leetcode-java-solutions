class Solution {

    List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> subsetsWithDup(int[] nums) {

        Arrays.sort(nums);

        rec(0, nums, new ArrayList<>());

        return res;
    }
    public void rec(int i, int[] nums, List<Integer> l) {

        if(i == nums.length) {
            res.add(new ArrayList<>(l));
            return;
        }
        l.add(nums[i]);
        rec(i + 1, nums, l);

        l.remove(l.size() - 1);
        while(i + 1 < nums.length && nums[i] == nums[i + 1])
            i++;

        rec(i + 1, nums, l);
    }
}