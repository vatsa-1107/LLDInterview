import java.util.concurrent.ThreadLocalRandom;

public class Dice {
    private int diceCount;
    private int MIN = 1;
    private int MAX = 6;
    public Dice(int diceCount){
        this.diceCount = diceCount;
    }
    public int rollDice(){
        int count = 0, sum = 0;
        while(count < diceCount){
            sum += ThreadLocalRandom.current().nextInt(MIN, MAX + 1);
            count++;
        }
        return sum;
    }
}
