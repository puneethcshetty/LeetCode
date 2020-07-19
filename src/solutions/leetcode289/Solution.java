package solutions.leetcode289;

class Solution {
    public void gameOfLife(int[][] board) {
        int row = board.length;
        int col = board[0].length;
        int[][] copy = new int[row][col];
        for(int i=0 ; i<row ; i++)
            for(int j=0 ; j<col ; j++)
                copy[i][j] = board[i][j];
        
        int val = 0;
        for(int i=0 ; i<row ; i++)
            for(int j=0 ; j<col ; j++){
                val = 0;
                if(j < col-1){
                    val+= copy[i][j+1];
                    if(i < row-1)
                        val+= copy[i+1][j+1];
                    if(i > 0)
                        val+= copy[i-1][j+1];
                }
                if(j > 0){
                    val+= copy[i][j-1];
                    if(i < row-1)
                        val+= copy[i+1][j-1];
                    if(i > 0)
                        val+= copy[i-1][j-1];
                }
                if(i > 0)
                    val+= copy[i-1][j];
                if(i < row-1)
                    val+= copy[i+1][j];
                
                if((copy[i][j] == 1 && val<2) || (copy[i][j] == 1 && val>3))
                    board[i][j] = 0;
                else if(copy[i][j] == 0 && val==3)
                    board[i][j] = 1;
            }
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
