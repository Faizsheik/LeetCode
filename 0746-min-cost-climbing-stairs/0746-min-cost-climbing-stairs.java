class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        
        if (n == 1) return cost[0];
        if (n == 2) return Math.min(cost[0], cost[1]);
        
        int secondLast = cost[0];
        int last = cost[1];
        
        for (int i = 2; i < n; i++) {
            int current = cost[i] + Math.min(secondLast, last);
            secondLast = last;
            last = current;
        }
        
        return Math.min(secondLast, last);
    }
}
