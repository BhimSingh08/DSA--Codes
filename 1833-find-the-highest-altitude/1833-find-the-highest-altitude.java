class Solution {
    public int largestAltitude(int[] gain) {
        int[] alt = new int[gain.length+1];
        alt[0] = 0;
        for(int i=0;i<gain.length;i++){
            alt[i+1] = alt[i]+gain[i];
        }
        int max = Integer.MIN_VALUE;
        for(int i=0;i<alt.length;i++){
            if(max < alt[i]){
                max = alt[i];
            }
        } 
        if(max < 0){
            return 0;
        }
        return max;
    }
}