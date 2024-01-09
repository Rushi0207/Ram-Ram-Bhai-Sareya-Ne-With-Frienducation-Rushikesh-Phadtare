public class Main {

    public static int maxScore(int[] cardPoints, int k) {
        int totalSum = 0;
        int windowSum = 0;
        int n = cardPoints.length;

        for (int i = 0; i < n; ++i) {
            totalSum += cardPoints[i];
            if (i < n - k)
                windowSum += cardPoints[i];
        }

        int minWindowSum = windowSum;

        for (int i = n - k; i < n; ++i) {
            windowSum += cardPoints[i] - cardPoints[i - (n - k)];
            minWindowSum = Math.min(minWindowSum, windowSum);
        }

        return totalSum - minWindowSum;
    }

    public static void main(String[] args) {
        int[] cardPoints = {1, 2, 3, 4, 5, 6, 1};
        int k = 3;

        int result = maxScore(cardPoints, k);
        System.out.println("Maximum score: " + result);
    }
}
