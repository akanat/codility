class Solution {
    public int solution(int[] A) {
        long arrSum = 0;
        for(int i=0; i<A.length; i++){
            arrSum += A[i];
        }   
        
        long minVal = Long.MAX_VALUE;
        long firstSum = A[0];
        for(int i=1; i<A.length; i++){
            if(Math.abs(arrSum - 2*firstSum) < minVal){
                minVal = Math.abs(arrSum - 2*firstSum);
            }
            firstSum += A[i];
        }   
        
        return (int)minVal;        
    }
}