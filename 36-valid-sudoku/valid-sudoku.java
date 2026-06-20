class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<Character> set = new HashSet<>();
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {

                if (board[i][j] > '0' && board[i][j] <= '9') {
                    if (set.contains(board[i][j]))
                        return false;
                    else
                        set.add(board[i][j]);

                }
            }
            set.clear();
        }

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[j][i] > '0' && board[j][i] <= '9') {
                    if (set.contains(board[j][i]))
                        return false;
                    else
                        set.add(board[j][i]);

                }
            }
            set.clear();
        }
        int a=0;
        int b=0;
        for (int k = 0; k < 9; k++) {
            for (int i = a; i < a+3; i++) {
                for (int j = b; j < b+3; j++) {

                    if (board[i][j] > '0' && board[i][j] <= '9') {
                        if (set.contains(board[i][j]))
                            return false;
                        else
                            set.add(board[i][j]);

                    }

                }
                

            }
            if(k<2){

                a=a+3;
                b=0;
            }
            else if(k==2){
                a=0;
                b=3;
            }
            else if(k<5){
                a=a+3;
                b=3;
            }
            else if(k==5){
                a=0;
                b=6;
            }
            else{
                a=a+3;
                b=6;
            }
            set.clear();
        }
        return true;
    }
}