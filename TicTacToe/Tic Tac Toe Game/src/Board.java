import java.security.KeyPair;
import java.util.ArrayList;
import java.util.List;
//import com.sun.tools.javac.util.Pair;
import org.apache.commons.lang3.tuple.Pair;
public class Board {
    private int sizeOfBoard;
    private PlayingPiece[][] board;
    public Board(int sizeOfBoard){
        this.sizeOfBoard = sizeOfBoard;
        board = new PlayingPiece[sizeOfBoard][sizeOfBoard];
    }
    public boolean addPiece(int xCord, int yCord, PlayingPiece playingPiece){
        if(board[xCord][yCord] == null){
            board[xCord][yCord] = playingPiece;
            return true;
        }else return false;
    }
    public void printBoard(){
        for (PlayingPiece[] playingPieces : board) {
            for (int j = 0; j < board.length; j++) {
                if (playingPieces[j] != null) {
                    System.out.print(playingPieces[j].getPieceType().name() + "   ");
                } else System.out.print("   ");
                System.out.print(" | ");
            }
            System.out.println();
        }
    }
    public List<Pair<Integer, Integer>> getFreeCells(){
        List<Pair<Integer, Integer>> freeCells = new ArrayList<>();
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board.length; j++){
                if(board[i][j] == null){
//                    Pair<Integer, Integer> val = Pair.of(i, j);
                    freeCells.add(Pair.of(i, j));
                }
            }
        }
        return freeCells;
    }
    public Integer getSizeOfBoard(){
        return sizeOfBoard;
    }
    public PlayingPiece[][] getBoard(){
        return board;
    }
}
