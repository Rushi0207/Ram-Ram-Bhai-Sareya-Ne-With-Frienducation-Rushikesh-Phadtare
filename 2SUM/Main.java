import java.util.*;
public class Main{
    public static void main(String args[]){
        Solution solution= new Solution();
        
        int[] nums1 = {2, 7, 11, 15};
        int target1 = 9;
        int[] result1 = solution.twoSum(nums1, target1);
        System.out.println("Example 1: Indices = [" + result1[0] + ", " + result1[1] + "]");


        int[] nums2 = {3, 2, 4};
        int target2 = 6;
        int[] result2 =solution.twoSum(nums2, target2);
        System.out.println("Example 2: Indices = [" + result2[0] + ", " + result2[1] + "]");

        int[] nums3 = {3, 3};
        int target3 = 6;
        int[] result3 = solution.twoSum(nums3, target3);
        System.out.println("Example 3: Indices = [" + result3[0] + ", " + result3[1] + "]");
    }
}
class Solution {
    public int[] twoSum(int[] nums, int target) {
       HashMap<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            
            // Check if the complement exists in the map
            if (map.containsKey(complement)) {
                // Return the indices of the two numbers
                return new int[] {map.get(complement), i};
            }
            
            // Add the current number and its index to the map
            map.put(nums[i], i);
        }
        
        // If no solution is found, return an empty array
        return new int[0];
    }
}