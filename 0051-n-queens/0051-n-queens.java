class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> ans = new ArrayList<>();
        char[][] board = new char[n][n];
        for(int i =0; i<n; i++){
            Arrays.fill(board[i],'.');

        }
        solve(board,n,ans,0);
        return ans;
        
    }
    private void solve(char[][] board, int n, List<List<String>> ans, int row ){
        if(row==n){
            ans.add(cunstructive(board));
            return;
        }
        for(int col =0; col<n; col++){
            if(isSafe(board,n,row,col)){
                board[row][col]= 'Q';
                solve(board,n,ans,row+1);
                board[row][col]= '.';

            }
        }
    }
    private boolean isSafe(char[][] board, int n, int row, int col){
        int r = row-1;
        int c = col+1;
        while(r>=0 && c<n){
            if(board[r][c]=='Q'){
                return false;
            }
            r--;
            c++;
        }
        r= row-1;
        c = col-1;
        while(r>=0 && c>=0){
            if(board[r][c]=='Q'){
                return false;
            }
            r--;
            c--;
            

        }
        r= row-1;
        c = col;
        while(r>=0){
            if(board[r][c]=='Q'){
                return false;
            }
            r--;
            
        }
        return true;

    }
    private List<String> cunstructive(char[][] board){
        List<String> res = new ArrayList<>();
        for(char[] row : board){
            res.add(new String(row));

        }
        return res;
    }
}