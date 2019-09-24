// you can also use imports, for example:
import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        HashSet<Integer> set = new HashSet<Integer>();        
        for(int element : A){
            if(element > A.length) break;
            set.add(element);
        }
        
        return set.size() == A.length ? 1 : 0;
    }
}