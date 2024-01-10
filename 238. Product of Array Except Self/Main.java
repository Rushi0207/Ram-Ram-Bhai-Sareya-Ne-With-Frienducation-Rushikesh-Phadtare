
public class Main{
    public static void main(String args[]){
       
        int[] nums = {1, 2, 3, 4};

        Solution solution = new Solution();
        int[] result = solution.productExceptSelf(nums);

        System.out.println("Input Array: " + java.util.Arrays.toString(nums));
        System.out.println("Output Array: " + java.util.Arrays.toString(result));
    }
}
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;

        int[] result = new int[n];

        // Calculate products to the left of each element
        int leftProduct = 1;
        for (int i = 0; i < n; i++) {
            result[i] = leftProduct;
            leftProduct *= nums[i];
        }

        //Calculate products to the right and update the result array
        int rightProduct = 1;
        for (int i = n - 1; i >= 0; i--) {
            result[i] *= rightProduct;
            rightProduct *= nums[i];
        }
        return result;   
    }
}