import org.apache.commons.lang3.tuple.Pair;
//import com.sun.tools.javac.util.Pair;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class TicTacToeGame {
    private Deque<Player> playerList;
    private Board board;

    public void initializeGame(){
        playerList = new LinkedList<>();
        PlayingPiece playingPieceX = new PlayingPieceX();
        PlayingPiece playingPieceO = new PlayingPieceO();
        Player playerA = new Player("Vatsal", playingPieceX);
        Player playerB = new Player("Ramesh", playingPieceO);
        playerList.add(playerA);
        playerList.add(playerB);
        board = new Board(3);
    }

    public String startGame(){
        boolean noWinner = true;
        while(noWinner){
            Player playerTurn = playerList.removeFirst();
            board.printBoard();
            List<Pair<Integer, Integer>> freeCells = board.getFreeCells();
            if(freeCells.isEmpty()){
                noWinner = false;
                continue;
            }
            System.out.println("Player: " + playerTurn.getNameOfPlayer() + " Enter row,column: ");
            Scanner scanner = new Scanner(System.in);
            String s = scanner.nextLine();
            String[] values = s.split(",");
            int inputRow = Integer.parseInt(values[0]);
            int inputCol = Integer.parseInt(values[1]);

            boolean pieceAddedSuccessfully = board.addPiece(inputRow, inputCol, playerTurn.getPlayingPiece());
            if(!pieceAddedSuccessfully){
                System.out.println("Incorrect position, try again");
                playerList.add(playerTurn);
                continue;
            }
            playerList.addLast(playerTurn);
            boolean winner = isThereWinnerExists(inputRow, inputCol, playerTurn.getPlayingPiece().getPieceType());
            if(winner){
                return playerTurn.getNameOfPlayer();
            }
        }
        return "Tie";
    }

    private boolean isThereWinnerExists(Integer inputRow, Integer inputCol, PieceType pieceType) {
        boolean rowMatch = true, colMatch = true, diagonalMatch = true, antiDiagonalMatch = true;
        for(int i = 0; i < board.getSizeOfBoard(); i++){
            if(board.getBoard()[inputRow][i] == null || board.getBoard()[inputRow][i].getPieceType() != pieceType){
                rowMatch = false;
            }
        }
        for(int i = 0; i < board.getSizeOfBoard(); i++){
            if(board.getBoard()[i][inputCol] == null || board.getBoard()[i][inputCol].getPieceType() != pieceType){
                colMatch = false;
            }
        }
        for(int i = 0; i < board.getSizeOfBoard(); i++){
            if(board.getBoard()[i][i] == null || board.getBoard()[i][i].getPieceType() != pieceType){
                diagonalMatch = false;
            }
        }
        for(int i = 0, j = board.getSizeOfBoard() - 1; i < board.getSizeOfBoard(); i++, j--){
            if(board.getBoard()[i][j] == null || board.getBoard()[i][j].getPieceType() != pieceType){
                antiDiagonalMatch = false;
            }
        }
        return rowMatch || colMatch || diagonalMatch || antiDiagonalMatch;
    }

}
