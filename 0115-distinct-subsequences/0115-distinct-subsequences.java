class Solution {
    public int numDistinct(String s, String t) {
        int n = s.length();
        int m= t.length();
        long[] dp = new long[m+1];
       dp[0]=1;
         //for(int i =1; i<n; i++){
          //  dp[i][0]=1;
      //  }
       // for(int j=1; j<m; j++){
        //    dp[0][j]=0;
      //  }
        for(int i=1; i<=n; i++){
            long prevDiagonal =1;
            for(int j =1; j<=m; j++){
                long temp = dp[j];
                if(s.charAt(i-1)==t.charAt(j-1)){
                    dp[j]= prevDiagonal + dp[j] ;
                }
                prevDiagonal = temp;
            }
        }
        return (int) dp[m];
        
    }
}