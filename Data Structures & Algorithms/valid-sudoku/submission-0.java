class Solution {
    public boolean isValidSudoku(char[][] board) {

        Set<Character> row = new HashSet<>(); 

        for(int i = 0; i < 9; i++){
            for(int j = 0; j < 9;  j++){
                if(!row.add(board[i][j]) && board[i][j] != '.'){
                    return false;
                }
            }
            row.clear();
        }

        Set<Character> col = new HashSet<>();
        for(int i = 0; i < 9; i++){
            for(int j = 0; j < 9;  j++){
                if(!col.add(board[j][i]) && board[j][i] != '.'){
                    return false;
                }
            }
        col.clear();
        }

        Map<Integer, Character> sub = new HashMap<>();
        for(int i = 0; i < 9;){
            for(int j = 0; j < 9;){
                if(!check3x3(board, i, j)){
                    return false;
                }
                j += 3;
            }
            i += 3;
        }

        return true;
    }


    private boolean check3x3(char[][] board, int row, int col){
        Set<Character> sub = new HashSet<>();

        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                if(!sub.add(board[i + row][j + col]) && board[i + row][j + col] != '.'){
                    return false;
                }
            }
        }
        return true;
    }
}
