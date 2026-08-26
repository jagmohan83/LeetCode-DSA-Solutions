class Solution {
    public boolean isValidSudoku(char[][] board) {
      boolean[][] rows = new boolean[9][9];
      boolean[][] cols= new boolean[9][9];
      boolean[][] boxes = new boolean[9][9];
      for(int r=0; r<9; r++){
        for(int c=0; c<9; c++){
            char ch = board[r][c];
            if(ch =='.'){
                continue;
            }
            int val = ch-'1';
            int boxeind = (r/3)*3+(c/3);
            if(rows[r][val] || cols[c][val] || boxes[boxeind][val]){
                return false;
            }
            rows[r][val]=true;
            cols[c][val]=true;
            boxes[boxeind][val]=true;
        }
      }
      return true;  
    }
}