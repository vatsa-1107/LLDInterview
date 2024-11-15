import java.util.Deque;
import java.util.LinkedList;

public class Game {
    private Board board;
    private Dice dice;
    private Deque<Player> players;
    private Player winner;
    public Game(){
        initializeGmae();
    }
    private void initializeGmae(){
        board = new Board(10, 5, 4);
        dice = new Dice(1);
        winner = null;
        players = new LinkedList<>();
        addPlayers();
    }
    private void addPlayers(){
        Player p1 = new Player("p1", 0);
        Player p2 = new Player("p2", 0);
        players.add(p1);
        players.add(p2);
    }
    public void startGame(){
        while(winner == null){
            Player currPlayer = players.removeFirst();
            players.addLast(currPlayer);
            System.out.println("Player turn is: " + currPlayer.getPlayerId() + " current Position is: " + currPlayer.getCurrentPosition());
            int diceNumbers = dice.rollDice();
            int playerNewPosition = currPlayer.getCurrentPosition() + diceNumbers;
            currPlayer.setCurrentPosition(jumpCheck(playerNewPosition));
            System.out.println("player turn is: " + currPlayer.getPlayerId() + " current Position is: " + currPlayer.getCurrentPosition());
            if(playerNewPosition >= board.getCells().length * board.getCells().length - 1){
                winner = currPlayer;
                break;
            }
        }
        System.out.println("Winner is: " + winner.getPlayerId());
    }
    private int jumpCheck(int playerNewPosition){
        if(playerNewPosition > board.getCells().length * board.getCells().length - 1){
            return playerNewPosition;
        }
        Cell cell = board.getCells(playerNewPosition);
        if(cell.getJump() != null && cell.getJump().getStart() == playerNewPosition){
            String jumpBy = cell.getJump().getStart() < cell.getJump().getEnd() ? "Ladder" : "Snake";
            System.out.println("jump done by: " + jumpBy);
            return cell.getJump().getEnd();
        }
        return playerNewPosition;
    }
}
