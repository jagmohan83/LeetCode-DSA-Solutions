class Solution {
    public int minCut(String s) {
        int n= s.length();
        boolean[][] palindrome = new boolean[n][n];
        for(int i= n-1; i>=0; i--){
            for(int j = 0; j<n; j++){
                if(s.charAt(i)==s.charAt(j)){
                    if(j-i<=1){
                        palindrome[i][j]= true;
                    }else{
                        palindrome[i][j]= palindrome[i+1][j-1];

                    }
                }
            }
        }
            int[] dp = new int[n];
            for(int i= 0; i<n; i++){
                if(palindrome[0][i]){
                    dp[i]=0;
                }else{
                    dp[i]=i;
                }
                for(int j = 0; j<i; j++){
                    if(palindrome[j+1][i]){
                        dp[i]= Math.min(dp[i], dp[j]+1);
                    }
                }
            }
        
        return dp[n-1];
        
    }
}