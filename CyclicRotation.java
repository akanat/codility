class Solution {
    public int[] solution(int[] A, int K) {
        for(int j=0; j<K; j++){
            int temp = 0;
            for(int i=0; i<A.length; i++){
                if(i == 0){
                    temp = A[0];
                    A[0] = A[A.length - 1];
                    A[A.length - 1] = temp;
                } else {
                    int tempLocal = A[i];
                    A[i]=temp;
                    temp = tempLocal;
                }
            } 
        }
        return A;
    }
    
}