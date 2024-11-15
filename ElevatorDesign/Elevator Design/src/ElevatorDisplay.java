public class ElevatorDisplay {
    private int floorNum;
    private Direction direction;
    public int getFloorNum(){
        return floorNum;
    }
    public Direction getDirection(){
        return direction;
    }
    public void showDisplay(){
        System.out.println(floorNum);
        System.out.println(direction);
    }
    public void setDisplay(int floorNum, Direction direction){
        this.floorNum = floorNum;
        this.direction = direction;
    }
}
