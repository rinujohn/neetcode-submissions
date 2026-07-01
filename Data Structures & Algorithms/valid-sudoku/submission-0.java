class Solution {
    public boolean isValidSudoku(char[][] board) {
        List< HashSet<Character>> rowMap = new ArrayList(board.length);
        List< HashSet<Character>> columnMap = new ArrayList(board[0].length);
        List< HashSet<Character>> boxMap = new ArrayList(9);
        
        for (int i=0 ;i<9;i++){
             rowMap.add(new HashSet());
             columnMap.add(new HashSet());
             boxMap.add(new HashSet());
        }
        for (int row=0 ;row<board.length;row++){
            
            for (int col = 0; col<board[0].length;col++){
                if (board[row][col] != '.'){
                     if(!rowMap.get(row).add(board[row][col])){
                        return false;
                    }
                    if(!columnMap.get(col).add(board[row][col])){
                        return false;
                    }
                    int blockIndex = (row/3) * 3 + (col/3);

                    if(!boxMap.get(blockIndex).add(board[row][col])){
                        return false;
                    }

                }
               
            }
        }
        return true;

    }
}
