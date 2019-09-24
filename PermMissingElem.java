class Solution {
    public int solution(int[] A) {
        int diff = 0;        
        for(int i=0; i<A.length; i++){
            diff += i + 1 - A[i];
        }        
        diff += A.length + 1;
        
        return diff ;
    }
}