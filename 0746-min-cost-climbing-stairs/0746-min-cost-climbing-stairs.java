class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        
        // Handle the case where there are fewer than 3 steps
        if (n == 1) return cost[0];
        if (n == 2) return Math.min(cost[0], cost[1]);
        
        // Initialize two variables to store the minimum cost to reach the last two steps
        int secondLast = cost[0];
        int last = cost[1];
        
        // Calculate the minimum cost to reach each step
        for (int i = 2; i < n; i++) {
            int current = cost[i] + Math.min(secondLast, last);
            secondLast = last;
            last = current;
        }
        
        // The answer is the minimum cost to reach the last two steps
        return Math.min(secondLast, last);
    }
}
