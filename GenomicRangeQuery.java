class Solution {
    public int[] solution(String S, int[] P, int[] Q) {
                
        int[] impactArr = new int[P.length];
        int[][] sums = new int[3][S.length() + 1];
        
        for(int i=0; i<S.length(); i++){
            if(S.charAt(i) == 'A'){
                sums[0][i+1] = 1;
            }
            if(S.charAt(i) == 'C'){
                sums[1][i+1] = 1;
            }
            if(S.charAt(i) == 'G'){
                sums[2][i+1] = 1;
            }
            
            sums[0][i+1] += sums[0][i];
            sums[1][i+1] += sums[1][i];
            sums[2][i+1] += sums[2][i];
            
        }
        
        for(int i=0; i<P.length; i++){
            int min;
            if(sums[0][Q[i]+1] > sums[0][P[i]]){
                min = 1;
            } else
            if(sums[1][Q[i]+1] > sums[1][P[i]]){
                min = 2;
            } else
            if(sums[2][Q[i]+1] > sums[2][P[i]]){
                min = 3;
            } else {
                min = 4;
            }
            
            impactArr[i] = min;
        }
        
        return impactArr;
    }
}