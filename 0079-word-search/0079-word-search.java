class Solution {
    public boolean exist(char[][] board, String word) {
        boolean[][] visited = new boolean[board.length][board[0].length];
        for(int i = 0; i<board.length; i++){
            for(int j = 0; j<board[0].length; j++){
                if(board[i][j]==word.charAt(0)){
                    if(dfs(0,board,visited,word, i, j)){
                        return true;
                    }
                }
            }
        }
        return false;
    }
    private boolean dfs(int index, char[][] board, boolean[][] visited, String word, int i, int j){
         if(index==word.length()){
            return true;
        }
        if(i<0 || j<0 || i>=board.length || j>=board[0].length){
            return false;
        }
       
        if(board[i][j] != word.charAt(index)){
            return false;
        }
        if(visited[i][j]){
            return false;
        }
        visited[i][j]= true;
        boolean right = dfs(index+1,board,visited,word,i,j+1);
        boolean down = dfs(index+1,board,visited,word,i+1,j);
        boolean left = dfs(index+1,board,visited,word,i,j-1);
        boolean up = dfs(index+1,board,visited,word,i-1,j);
        boolean ans = right || down || left || up;
        visited[i][j]=false;
        return ans;
    }

        
}