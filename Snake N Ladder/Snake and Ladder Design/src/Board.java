import java.util.concurrent.ThreadLocalRandom;

public class Board {
    private Cell[][] cells;
    public Board(int boardSize, int numOfLadders, int numOfSnakes){
        initializeBoard(boardSize);
        addSnakesAndLadders(cells, numOfLadders, numOfSnakes);
    }
    public void initializeBoard(int boardSize){
        cells = new Cell[boardSize][boardSize];
        for(int i = 0; i < boardSize; i++){
            for(int j = 0; j < boardSize; j++){
                cells[i][j] = new Cell();
            }
        }
    }
    public void addSnakesAndLadders(Cell[][] cells, int numOfLadders, int numOfSnakes){
        while(numOfSnakes > 0){
            int snakeHead = ThreadLocalRandom.current().nextInt(1, cells.length * cells.length - 1);
            int snakeTail = ThreadLocalRandom.current().nextInt(1, cells.length * cells.length - 1);
            if(snakeTail >= snakeHead) continue;
            Jump obj = new Jump();
            obj.setStart(snakeHead);
            obj.setEnd(snakeTail);
            Cell cell = getCells(snakeHead);
            cell.setJump(obj);
            numOfSnakes--;
        }
        while(numOfLadders > 0){
            int ladderHead = ThreadLocalRandom.current().nextInt(1, cells.length * cells.length - 1);
            int ladderTail = ThreadLocalRandom.current().nextInt(1, cells.length * cells.length - 1);
            if(ladderHead >= ladderTail) continue;
            Jump obj = new Jump();
            obj.setStart(ladderHead);
            obj.setEnd(ladderTail);
            Cell cell = getCells(ladderHead);
            cell.setJump(obj);
            numOfLadders--;
        }
    }
    public Cell getCells(int playerPosition){
        int x = playerPosition/ cells.length;
        int y = playerPosition % cells.length;
        return cells[x][y];
    }

    public Cell[][] getCells() {
        return cells;
    }

    public void setCells(Cell[][] cells) {
        this.cells = cells;
    }
}
