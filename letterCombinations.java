class Solution {
    public List<String> letterCombinations(String digits) {
       if(digits.isEmpty()) return Collections.emptyList();
       String[] phone = {"abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"} ;
       List<String> out = new ArrayList<>();
       backtrack("",digits,phone,out);
       return out;
    }
    private void backtrack(String c,String n, String[] p, List<String> out){
        if(n.isEmpty()){
            out.add(c);
        }else{
            String l = p[n.charAt(0) - '2'];
            for(char l1 : l.toCharArray()){
                backtrack(c+l1,n.substring(1),p,out);
            }
        }
    }
}
