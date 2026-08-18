class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<String> colSet = new HashSet<>() ;
        HashSet<String> gridSet = new HashSet<>() ;
        for(int i = 0 ; i < 9 ; i++) {
            HashSet<Character> rowSet = new HashSet<>() ;

            for(int j = 0 ; j < 9 ; j++) {
                if(board[i][j] == '.') continue ;
                int cellNumber = ((i/3)*3) + (j/3);
                String cellNumberString = cellNumber + "" ;

                if(rowSet.contains(board[i][j]) ||
                colSet.contains(board[i][j] + "col : " + j) ||
                gridSet.contains(board[i][j] + cellNumberString)
                ) {
                    return false ;
                }

                rowSet.add(board[i][j]) ;
                colSet.add(board[i][j] + "col : " + j) ;
                gridSet.add(board[i][j] + cellNumberString) ;

            }
        }
        return true ;
    }
}
