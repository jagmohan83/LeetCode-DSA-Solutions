class Solution {
    public boolean exist(char[][] board, String word) {
      
        for(int i = 0; i<board.length; i++){
            for(int j = 0; j<board[0].length; j++){
                if(board[i][j]==word.charAt(0)){
                    if(dfs(0,board,word, i, j)){
                        return true;
                    }
                }
            }
        }
        return false;
    }
    private boolean dfs(int index, char[][] board, String word, int i, int j){
         if(index==word.length()){
            return true;
        }
        if(i<0 || j<0 || i>=board.length || j>=board[0].length || board[i][j] != word.charAt(index)){
            return false;
        }
       
        char temp = board[i][j];
        
       
        board[i][j] = '#';

        
        boolean found = dfs(index + 1, board, word, i, j + 1) ||
                        dfs(index + 1, board, word, i + 1, j) ||
                        dfs(index + 1, board, word, i, j - 1) ||
                        dfs(index + 1, board, word, i - 1, j);

      
        board[i][j] = temp;

        return found;
    }
}
    
