class Solution {
    public int solution(int[] A) {
        int pairs = 0;
        int zeros = 0;
        int limit = 1000 * 1000 * 1000;
        for(int el : A){
            if(el == 0){
                zeros++;
            }
            if(zeros > 0 && el == 1){
                pairs += zeros;
                if(pairs > limit){
                    return -1;
                }
            }
        }
        
        return pairs;
    }
}