class Solution {
    public int maxCoins(int[] nums) {
        int n = nums.length;

    int[] padded = new int[n + 2];
    padded[0] = 1;
    padded[n + 1] = 1;

    for (int i = 0; i < n; i++) {
        padded[i + 1] = nums[i];
    }

    int[][] dp = new int[n + 2][n + 2];

    for (int len = 1; len <= n; len++) {
        for (int l = 1; l + len - 1 <= n; l++) {
            int r = l + len - 1;

            for (int k = l; k <= r; k++) {
                int coins = dp[l][k - 1]
                          + dp[k + 1][r]
                          + padded[l - 1] * padded[k] * padded[r + 1];

                dp[l][r] = Math.max(dp[l][r], coins);
            }
        }
    }

    return dp[1][n];
        
    }
}