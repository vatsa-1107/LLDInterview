import java.util.PriorityQueue;

public class ElevatorController {
    private ElevatorCar elevatorCar;
    PriorityQueue<Integer> upMinPQ;
    PriorityQueue<Integer> downMaxPQ;
    public ElevatorController(ElevatorCar elevatorCar){
        this.elevatorCar = elevatorCar;
        upMinPQ = new PriorityQueue<>();
        downMaxPQ = new PriorityQueue<>((a, b) -> b.compareTo(a));
    }
    public void submitExternalERequest(int floor, Direction dir){
        if(dir == Direction.DOWN) downMaxPQ.offer(floor);
        else upMinPQ.offer(floor);
    }
    public void submitInternalRequest(int floor){

    }
    public void controlElevator(){

    }
}
