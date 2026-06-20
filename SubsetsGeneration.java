class Solution {
    public ArrayList<ArrayList<Integer>> subsets(int arr[]) {
        Arrays.sort(arr);
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        backtrack(0,arr,res,new ArrayList<>());
        return res;
    }
    private void backtrack(int idx,
                           int[] arr,
                            ArrayList<ArrayList<Integer>> res,
                            ArrayList<Integer> curr){
                                res.add(new ArrayList<>(curr));
                                for(int i = idx;i<arr.length;i++){
                                    if(i > idx && arr[i] == arr[i-1]){
                                        continue;
                                    }
                                    curr.add(arr[i]);
                                    backtrack(i+1,arr,res,curr);
                                    curr.remove(curr.size()-1);
                                }
                            }
}
