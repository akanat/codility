class Solution {
    public int[] solution(int N, int[] A) {
        int[] counters = new int[N];
        
        int currMax = 0;
        int localMax = 0;
        for(int i=0; i<A.length; i++){
            if(A[i] <= N && A[i] >= 1){
                
                if(counters[A[i]-1] >= localMax){
                    counters[A[i]-1]++;
                } else {
                    counters[A[i]-1] = localMax + 1;
                }
                
                if(counters[A[i]-1] > currMax){
                    currMax = counters[A[i]-1];
                }
            } else if(A[i] == N+1){
                localMax = currMax;
            }
        }        
        
        for(int i=0; i<N; i++){
            if(counters[i] < localMax){
                counters[i] = localMax;
            }
        }
        
        return counters;
    }
}