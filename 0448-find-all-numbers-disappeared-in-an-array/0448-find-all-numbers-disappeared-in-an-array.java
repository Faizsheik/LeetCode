import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        // Step 1: Sort the array
        Arrays.sort(nums);
        
        List<Integer> result = new ArrayList<>();
        int n = nums.length;
        int expected = 1; // We start expecting number 1
        
        // Step 2: Find missing numbers
        for (int num : nums) {
            while (num > expected) {
                result.add(expected);
                expected++;
            }
            // Move to the next expected number
            if (num == expected) {
                expected++;
            }
        }
        
        // Add any remaining missing numbers up to n
        while (expected <= n) {
            result.add(expected);
            expected++;
        }
        
        return result;
    }
}
