class Solution {
    public int[] asteroidCollision(int[] ast) {
        int n = ast.length;
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(ast [0]);
        int end = 0;
        for(int pt = 1; pt < n; pt ++){
            if(ast[pt] < 0){
                while(end >=0 && (ans.get(end) < ((-1) * (ast[pt])) && ans.get(end) > 0)){
                    ans.remove(end);
                    end --;
                }
                if(end >=0 && ans.get(end) == ((-1) * (ast[pt]))){
                    ans.remove(end);
                    end --;
                }
                else if(end < 0){
                    end = 0;
                    ans.add(ast[pt]);
                }else if (ans.get(end) < 0){
                    ans.add(ast[pt]);
                    end++;
                }
            }else {
                ans.add(ast[pt]);
                end ++;
            }
        }
        int []arr= new int [end+1];
        for(int ii=0;ii<end+1;ii++){
            arr[ii] = ans.get(ii);
        }
        return arr;
    }
}