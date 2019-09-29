class Solution {
    public int solution(int[] A) {
        double minAvg = Double.MAX_VALUE;
        int minAvgIndex = 0;
        
        for(int i=0; i<A.length-2; i++){
            if((double)(A[i] + A[i+1])/2 < minAvg){
                minAvg = (double)(A[i] + A[i+1])/2;
                minAvgIndex = i;
            }
            
            if((double)(A[i] + A[i+1] + A[i+2])/3 < minAvg){
                minAvg = (double)(A[i] + A[i+1] + A[i+2])/3;
                minAvgIndex = i;
            }
            
            if(i == A.length-3){
                if((double)(A[i+1] + A[i+2])/2 < minAvg){
                    minAvg = (double)(A[i+1] + A[i+2])/2;
                    minAvgIndex = i+1;
                }    
            }
        }
        
        return minAvgIndex;
    }
}