class Solution {
    public int longestIncreasingPath(int[][] matrix) {
        int n= matrix.length;
        int m= matrix[0].length;
        int[][] memo = new int[n][m];
        int ans =0;
        for(int i=0; i<n; i++){
            for(int j = 0; j<m; j++){
             ans = Math.max(ans, (Dfs(matrix,i,j,memo)));
            }
        }
        return ans;
        
    }
    private int Dfs(int[][] matrix, int i, int j, int[][] memo){
        if(memo[i][j] !=0){
            return memo[i][j];
        }
        int n= matrix.length;
        int m= matrix[0].length;
        int[] dc = {-1,1,0,0};
        int[] dr = {0,0,-1,1};
        int max = 0;
        
        for(int k =0; k<4; k++){
            int nr = i+dr[k];
            int  nc = j+dc[k];
            if(nr>=0 && nr<n && nc>=0 && nc<m){
                
                    if(matrix[i][j]<matrix[nr][nc]){
                    max= Math.max(max,(Dfs(matrix,nr,nc,memo)));
                    }
                }
                
            
            
        }
        memo[i][j]= 1+ max;
        return memo[i][j];
    }
}