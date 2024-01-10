class Main{
    public static void main(String args[]){
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = {2, 5, 6};
        int n = 3;

        Solution solution = new Solution();
        solution.merge(nums1, m, nums2, n);

        System.out.println("Merged Array: " + java.util.Arrays.toString(nums1));
    }
}


class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1; // Pointer for nums1
        int j = n - 1; // Pointer for nums2
        int mergedIndex = m + n - 1; // Pointer for the merged array (nums1)

        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[mergedIndex] = nums1[i];
                i--;
            } else {
                nums1[mergedIndex] = nums2[j];
                j--;
            }
            mergedIndex--;
        }

        // If there are remaining elements in nums2, copy them to nums1
        while (j >= 0) {
            nums1[mergedIndex] = nums2[j];
            j--;
            mergedIndex--;
        }
    }
}