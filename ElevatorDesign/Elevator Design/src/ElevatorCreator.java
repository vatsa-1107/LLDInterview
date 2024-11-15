import java.util.ArrayList;
import java.util.List;

public class ElevatorCreator {
    static List<ElevatorController> elevatorControllerList = new ArrayList<>();
    static {
        ElevatorCar e1 = new ElevatorCar();
        e1.setElevatorId(1);
        ElevatorController controller1 = new ElevatorController(e1);
        ElevatorCar e2 = new ElevatorCar();
        e2.setElevatorId(2);
        ElevatorController controller2 = new ElevatorController(e2);
        ElevatorCar e3 = new ElevatorCar();
        e3.setElevatorId(3);
        ElevatorController controller3 = new ElevatorController(e3);
        elevatorControllerList.add(controller1);
        elevatorControllerList.add(controller2);
        elevatorControllerList.add(controller3);
    }
}
