public class Main {

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test cases
        String s1 = "A man, a plan, a canal: Panama";
        System.out.println("Example 1: " + solution.isPalindrome(s1)); // Output: true

        String s2 = "race a car";
        System.out.println("Example 2: " + solution.isPalindrome(s2)); // Output: false

        String s3 = " ";
        System.out.println("Example 3: " + solution.isPalindrome(s3)); // Output: true
    }

    static class Solution {
        public boolean isPalindrome(String s) {
            String cleanString = s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");

            // Compare with its reverse
            String reversedString = new StringBuilder(cleanString).reverse().toString();

            return cleanString.equals(reversedString);
        }
    }
}
