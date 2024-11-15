import java.util.ArrayList;
import java.util.List;

public class Store {
    private int storeId;
    private VehicleInventoryManagement vehicleInventoryManagement;
    private Location location;
    private List<Reservation> reservationList;


    public int getStoreId() {
        return storeId;
    }

    public void setStoreId(int storeId) {
        this.storeId = storeId;
    }

    public VehicleInventoryManagement getVehicleInventoryManagement() {
        return vehicleInventoryManagement;
    }

    public void setVehicleInventoryManagement(VehicleInventoryManagement vehicleInventoryManagement) {
        this.vehicleInventoryManagement = vehicleInventoryManagement;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public List<Reservation> getReservationList() {
        return reservationList;
    }

    public void setReservationList(List<Reservation> reservationList) {
        this.reservationList = reservationList;
    }

    public void setVehicles(List<Vehicle> vehicleList){
        vehicleInventoryManagement = new VehicleInventoryManagement(vehicleList);
    }
    public List<Vehicle> getVehicles(VehicleType vehicleType){
        List<Vehicle> vehicleList = new ArrayList<>();
        for(Vehicle vehicle: vehicleInventoryManagement.getVehicleList()){
            if(vehicle.getVehicleType().equals(vehicleType)) vehicleList.add(vehicle);
        }
        return vehicleList;
    }
    public Reservation createReservation(User user, Vehicle vehicle){
        Reservation reservation = new Reservation();
        reservation.createReserve(user, vehicle);
        reservationList.add(reservation);
        return reservation;
    }
    public void completeReservation(Reservation reservation){
        reservation.setReservationStatus(ReservationStatus.COMPLETED);
    }
}
