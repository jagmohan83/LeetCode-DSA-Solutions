class Solution {
    public int minScoreTriangulation(int[] values) {
        int n= values.length;
        int[][] dp = new int[n][n];
        for(int len =2; len<n; len++){
            for(int i =1; i+len-1<n; i++){
                int j = i+len-1; 
                dp[i][j]= Integer.MAX_VALUE;
                for(int k= i; k<j; k++){
                    int cost = dp[i][k]+dp[k+1][j]+values[i-1]*values[k]*values[j];
                    dp[i][j]= Math.min(dp[i][j],cost);
                }
            }
        }
        return dp[1][n-1];
        
    }
}