class Solution {
    public ArrayList<String> findPermutation(String s) {
        // Code here
        ArrayList<String> ans = new ArrayList<>();
        StringBuilder str = new StringBuilder(s);
        generatePremutation(0,str,ans);
        Collections.sort(ans);
        return ans;
    }
    private void generatePremutation(int idx ,StringBuilder str,ArrayList<String> ans){
        if(idx == str.length()){
            ans.add(str.toString());
            return;
        }
        HashSet<Character> set = new HashSet<>();
        for(int i = idx;i < str.length();i++){
            if (set.contains(str.charAt(i))) continue;  

            set.add(str.charAt(i));
            swap(i,str,idx);
            generatePremutation(idx+1, str,ans);
            swap(i,str,idx);
        }
    }
    private void swap(int i,StringBuilder str,int j){
        char temp = str.charAt(i);
        str.setCharAt(i,str.charAt(j));
        str.setCharAt(j,temp);
    }
}
