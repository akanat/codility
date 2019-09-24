// you can also use imports, for example:
import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int X, int[] A) {
        Set<Integer> leaves = new HashSet<Integer>();
        
        for(int i=0; i<A.length; i++){
            leaves.add(A[i]);
            if(leaves.size() == X){
                return i;
            }
        }
        
        return -1;
    }
}