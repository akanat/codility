// you can also use imports, for example:
import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        Set<Integer> set = new HashSet<Integer>();
        
        for(int elem : A){
            set.add(elem);
        }
        
        int num = 1;
        
        while (set.contains(num)) {
            num++;
        }
        
        return num;
    }
}