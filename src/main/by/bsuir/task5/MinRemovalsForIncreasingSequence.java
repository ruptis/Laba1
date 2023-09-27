package main.by.bsuir.task5;

public class MinRemovalsForIncreasingSequence {
    private MinRemovalsForIncreasingSequence() {
    }

    public static int getMinRemovals(int[] array) {
        int length = array.length;
        int[] dp = new int[length];

        fillDp(array, length, dp);

        int maxDp = getMaxDp(dp);

        return length - maxDp;
    }

    private static void fillDp(int[] array, int length, int[] dp) {
        for (int i = 0; i < length; i++) {
            dp[i] = calculateLIS(array, dp, i);
        }
    }

    private static int calculateLIS(int[] array, int[] dp, int currentIndex) {
        int maxLIS = 1;
        for (int i = 0; i < currentIndex; i++) {
            if (array[currentIndex] > array[i]) {
                maxLIS = Math.max(maxLIS, dp[i] + 1);
            }
        }
        return maxLIS;
    }

    private static int getMaxDp(int[] dp) {
        int maxDp = 0;
        for (int len : dp) {
            maxDp = Math.max(maxDp, len);
        }
        return maxDp;
    }
}
