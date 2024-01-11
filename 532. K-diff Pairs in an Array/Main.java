import java.util.HashMap;
import java.util.Map;
class KDiffPairsInArray {

    public int findPairs(int[] nums, int k) {
        if (nums == null || nums.length == 0 || k < 0) {
            return 0;
        }

        // Create a HashMap to store the frequency of each number
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : nums) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        int count = 0;

        // Iterate through the array and count valid k-diff pairs
        for (int num : frequencyMap.keySet()) {
            if (k == 0) {
                // Count the number of elements with frequency greater than 1
                if (frequencyMap.get(num) > 1) {
                    count++;
                }
            } else {
                // Check if there exists another number with the required difference
                if (frequencyMap.containsKey(num + k)) {
                    count++;
                }
            }
        }

        return count;
    }
}
public class Main{
    public static void main(String[] args) {
        KDiffPairsInArray solution = new KDiffPairsInArray();

        int[] nums1 = {3, 1, 4, 1, 5};
        int k1 = 2;
        System.out.println("Example 1: " + solution.findPairs(nums1, k1)); // Output: 2

        int[] nums2 = {1, 2, 3, 4, 5};
        int k2 = 1;
        System.out.println("Example 2: " + solution.findPairs(nums2, k2)); // Output: 4

        int[] nums3 = {1, 3, 1, 5, 4};
        int k3 = 0;
        System.out.println("Example 3: " + solution.findPairs(nums3, k3)); // Output: 1
    }
}
