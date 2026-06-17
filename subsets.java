class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> sum = new ArrayList<>();
        findSum(0,new ArrayList<>(),nums,sum);
        return sum;
    }
    private void findSum(int idx,List<Integer> curr,int[] nums,List<List<Integer>> sum){
        if(idx == nums.length){
            sum.add(new ArrayList<>(curr));
            return;
        }
        curr.add(nums[idx]);
        findSum(idx+1,curr,nums,sum);
        curr.remove(curr.size()-1);
        findSum(idx+1,curr,nums,sum);
    }
}
