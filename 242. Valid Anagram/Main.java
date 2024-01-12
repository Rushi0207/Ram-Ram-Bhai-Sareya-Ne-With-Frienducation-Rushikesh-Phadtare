public class Main {

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test cases
        String s1 = "anagram";
        String t1 = "nagaram";
        System.out.println("Example 1: " + solution.isAnagram(s1, t1)); // Output: true

        String s2 = "rat";
        String t2 = "car";
        System.out.println("Example 2: " + solution.isAnagram(s2, t2)); // Output: false

        // Add more test cases as needed
    }

    static class Solution {
        public boolean isAnagram(String s, String t) {
            if (s.length() != t.length()) {
                return false;
            }

            int[] charCount = new int[26]; // Assuming input consists of lowercase English letters

            // Count occurrences of characters in string s
            for (char c : s.toCharArray()) {
                charCount[c - 'a']++;
            }

            // Decrement the count for characters in string t
            for (char c : t.toCharArray()) {
                int index = c - 'a';
                charCount[index]--;
                if (charCount[index] < 0) {
                    return false; // If a character count becomes negative, not an anagram
                }
            }

            return true;
        }
    }
}