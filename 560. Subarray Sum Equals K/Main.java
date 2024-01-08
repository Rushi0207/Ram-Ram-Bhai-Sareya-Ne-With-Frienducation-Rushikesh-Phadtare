import java.util.HashMap;
import java.util.Map;

public class Main{
    public static void main(String args[]){
        Solution solution =new Solution();
        int[] nums1 = {1, 1, 1};
        int k1 = 2;
        System.out.println(solution.subarraySum(nums1, k1)); // Output: 2

        int[] nums2 = {1, 2, 3};
        int k2 = 3;
        System.out.println(solution.subarraySum(nums2, k2)); // Output: 2
    }
}

class Solution {
    public int subarraySum(int[] nums, int k) {
        int count = 0;
        int sum = 0;
        Map<Integer, Integer> sumFreq = new HashMap<>();
        sumFreq.put(0, 1); 

        for (int num : nums) {
            sum += num;
            if (sumFreq.containsKey(sum - k)) {
                count += sumFreq.get(sum - k);
            }
            sumFreq.put(sum, sumFreq.getOrDefault(sum, 0) + 1);
        }

        return count;
    }
}