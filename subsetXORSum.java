class Solution {
    private int sum = 0;
    public int subsetXORSum(int[] nums) {
        backtracking(new ArrayList<>(),nums,0);
        return sum;
    }
    void backtracking (List<Integer> cur,int[] nums,int idx){
        int tot = 0;
        if(cur.size() == 1){
            sum += cur.get(0);
        }else{
            for(int num : cur){
                tot ^= num;
            }
            sum += tot;
        }
        for(int i = idx;i<nums.length;i++){

            cur.add(nums[i]);
            backtracking(cur,nums,i+1);
            cur.remove(cur.size() - 1);
        }
    }
}
