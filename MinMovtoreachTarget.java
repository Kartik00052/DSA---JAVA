class Solution {
    public int minMoves(int target, int maxDoubles) {
    int x=0;   
  int minMoves = 0;
            while (target > 1) {
                if (maxDoubles > 0) {
                    if (target % 2 == 0) {
                        target /= 2;
                        maxDoubles--;
                    } else {
                        target--;
                    }
                } else {
                    minMoves += target - 1;
                    break;
                }
                minMoves++;
            }
            return minMoves;
        }
}
