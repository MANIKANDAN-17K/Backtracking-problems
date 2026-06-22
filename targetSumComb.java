class Solution {
    public ArrayList<ArrayList<Integer>> targetSumComb(int[] arr, int target) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> curr = new ArrayList<>();
        findCombination(target,0,arr,curr, ans);
        return ans;
    }
    private void findCombination(int target,int idx,int[] arr, ArrayList<Integer> curr, ArrayList<ArrayList<Integer>> ans){
        if(idx == arr.length){
            if(target == 0){
                ans.add(new ArrayList<>(curr));
            }
            return; 
        }
        if(arr[idx] <= target){
            curr.add(arr[idx]);
            findCombination(target - arr[idx],idx,arr,curr,ans);
            curr.remove(curr.size()-1);
        }
        findCombination(target,idx+1,arr,curr,ans);
    }
}
