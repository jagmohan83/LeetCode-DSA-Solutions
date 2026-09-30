class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int n= text1.length();
        int m = text2.length();
        //int[][] dp = new int[n+1][m+1];
       // dp[n][0]=0;
       // dp[0][m]=0;
       int[] dp = new int[m+1];

        for(int i =1; i<=n; i++){
            int prevDiagonal =0;
            for(int j =1; j<=m; j++){
                int temp = dp[j];
                if(text1.charAt(i-1)==text2.charAt(j-1)){
                    dp[j]= 1+ prevDiagonal;

                }else{
                    dp[j]= Math.max(dp[j],dp[j-1]);
                }
                prevDiagonal= temp;
            }
        }
        return dp[m];

        
    }
}