class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double max_avg = Double.NEGATIVE_INFINITY;; 

        for (int j = 0; j <= nums.length - k; j++) 
        {
            int sum = 0;
            
            for (int i = j; i < j + k; i++) {
                sum += nums[i];
            }
            
            double avg = (double) sum / k;
            
            if (avg > max_avg) {
                max_avg = avg;
            }
        }

        return max_avg;
    }
}
