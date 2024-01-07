public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

    
        int[] prices1 = {7, 1, 5, 3, 6, 4};
        System.out.println("Max profit for prices1: " + solution.maxProfit(prices1)); // Output: 5

        int[] prices2 = {7, 6, 4, 3, 1};
        System.out.println("Max profit for prices2: " + solution.maxProfit(prices2)); // Output: 0
    }
}



class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int price : prices) {
           
            if (price < minPrice) {
                minPrice = price;
            } else if (price - minPrice > maxProfit) {
                
                maxProfit = price - minPrice;
            }
        }

        return maxProfit;
    }
}