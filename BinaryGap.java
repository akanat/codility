class Solution {
    public int solution(int N) {
        int maxGap = 0;
        int currGap = 0;
        boolean isGapOpen = false;
        int prev = 0;
        while (N > 0) {
            int reminder = N % 2;

            if(reminder == 0 && prev ==1) {
                isGapOpen = true;
            }

            if(reminder == 0 && isGapOpen) {
                currGap++;
            }

            if(reminder == 1 && isGapOpen) {
                isGapOpen = false;
                if(currGap > maxGap) {
                    maxGap = currGap;
                }
                currGap = 0;
            }

            N = N / 2;

            prev  = reminder;
        }

        return maxGap;
    }
}