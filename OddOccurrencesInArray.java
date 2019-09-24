// you can also use imports, for example:
import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        HashSet <Integer> values = new HashSet<Integer>();
        
        for(int i=0; i<A.length; i++){
            int firstLength = values.size();
            values.add(A[i]);
            int afterLength = values.size();
            
            if(firstLength == afterLength) {
                values.remove(A[i]);
            }
        }
        return values.iterator().next();
    }
}