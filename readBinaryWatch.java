class Solution {
    public List<String> readBinaryWatch(int turnedOn) {
        int[] h = new int[]{8,4,2,1};
        int[] m = new int[]{32,16,8,4,2,1};
        Set<String> res = new HashSet<>();
        for(int i = 0;i<= turnedOn;i++){
            List<Integer> l1  = generateTime(h,i);
            List<Integer> l2 = generateTime(m,turnedOn - i);
            for(int h1 : l1){
                if(h1 >= 12){
                    continue;
                }
                    for(int m1 : l2){
                        if(m1 >= 60){
                            continue;
                        }
                        res.add(h1+":"+(m1 < 10 ? "0"+m1 : m1));
                    }
                
            }
        }
        return new ArrayList(res);
    }
    List<Integer> generateTime(int[] n, int c){
        List<Integer> res = new ArrayList<>();
        recursion(n,c,0,0,res);
        return res;
    }
    void recursion(int[] n,int c, int s, int p,List<Integer> r){
        if(c == 0){
            r.add(s);
            return ;
        }
        for(int i = p;i<n.length;i++){
            recursion(n,c-1,s+n[i],i+1,r);
        }
    }
}
