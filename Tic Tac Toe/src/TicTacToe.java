public class TicTacToe {
    private final int board[][];
    private final int n;
    private int rowsum[],colsum[],diagsum, revdiagsum;
    private int winner;
    public TicTacToe(final int n){
        this.n = n;
        this.board = new int[n][n];
        this.rowsum = new int[n];
        this.diagsum = 0;
        this.revdiagsum = 0;
        this.winner = 0;

    }
    /*
     * Makes a move on the board and returns the winner if the move is a winning move
     * @param player is either 0 or 1
     * @param row    is the move's row index
     * @param col    is the move's column index
     * @param winner is 1 if player 0 wins -1 if player 1 wins and 0 otherwise
     * @throws IllegalArgumentException if the move is an illegal move
     */
    public int getWinner(){
        return this.winner;
    }
    public int move(int player, int row, int col) throws IllegalArgumentException{
        if(row<0 || col<0 || row>=n || col>=n){
            throw new IllegalArgumentException("Moved out of the board");
        }else if(board[row][col]!=0){
            throw new IllegalArgumentException("Square is already occupied");
        }else if(player!=0 && player!=1){
            throw new IllegalArgumentException("Invalid player");
        }else{
            board[row][col] = player==0?1:-1;
            rowsum[row]+=board[row][col];
            colsum[col]+=board[row][col];
            if(row==col)diagsum+=board[row][col];
            if(row==n-col-1)revdiagsum+=board[row][col];
            if(Math.abs(rowsum[row])==n || Math.abs(colsum[col])==n || Math.abs(diagsum)==n || Math.abs(revdiagsum)==n) this.winner=board[row][col];
        }
        return this.getWinner();
    }
}
