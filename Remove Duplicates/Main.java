import java.util.*;
public class Main{
    public static void main(String args[]){
        Solution solution = new Solution();

        int[] nums1 = {1, 1, 2};
        int k1 = solution.removeDuplicates(nums1);
        System.out.println("Output 1: " + k1 + ", nums = " + Arrays.toString(nums1));

        int[] nums2 = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int k2 = solution.removeDuplicates(nums2);
        System.out.println("Output 2: " + k2 + ", nums = " + Arrays.toString(nums2));

    }
}
class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
        return 0;
    }

    int uniqueCount = 1; // At least one unique element

    for (int i = 1; i < nums.length; i++) {
        if (nums[i] != nums[i - 1]) {
            nums[uniqueCount] = nums[i];
            uniqueCount++;
        }
    }

    return uniqueCount;
    }
}