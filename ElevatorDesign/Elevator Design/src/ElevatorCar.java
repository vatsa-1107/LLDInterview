public class ElevatorCar {
    private int elevatorId;
    private ElevatorDisplay display;
    private int currentFloor;
    private Direction direction;
    private ElevatorState elevatorState;
    private InternalButton internalButtons;
    public ElevatorCar(){
        display = new ElevatorDisplay();
        internalButtons = new InternalButton();
        elevatorState = ElevatorState.IDLE;
        currentFloor = 0;
        direction = Direction.UP;
    }
    public void showDisplay(){
        display.showDisplay();
    }
    public void pressButton(int destination){
        internalButtons.pressButton(destination, this);
    }
    public void setDisplay(){
        this.display.setDisplay(currentFloor, direction);
    }
    public boolean moveElevator(int destFloor, Direction dir){
        int startFloor = currentFloor;
        if(dir.equals(Direction.UP)){
            for(int i = startFloor; i <= destFloor; i++){
                currentFloor = i;
                setDisplay();
                showDisplay();
                if(i == destFloor) return true;
            }
        }
        return false;
    }
    public Integer getElevatorId(){
        return elevatorId;
    }
    public void setElevatorId(int elevatorId){
        this.elevatorId = elevatorId;
    }

}
