import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<User> userList = addUsers();
        List<Store> storeList = addStores();
        List<Vehicle> vehicleList = addVehicles();
        VehicleRentalSystem vehicleRentalSystem = new VehicleRentalSystem(storeList, userList);

        User user = new User();

        Location location = new Location("Modinagar", 201204, "Ghaziabad", "UP", "India");
        Store store = vehicleRentalSystem.getStore(location);
        List<Vehicle> storeVehicles = store.getVehicles(VehicleType.CAR);
        Reservation reservation = store.createReservation(user, vehicleList.get(0));
        Bill bill = new Bill(reservation);
        Payment payment = new Payment();
        payment.payBill(bill);
        store.completeReservation(reservation);
    }
    public static List<Vehicle> addVehicles(){
        List<Vehicle> vehicleList = new ArrayList<>();
        Vehicle vehicle = new Vehicle();
        vehicle.setVehicleId(1);
        vehicleList.add(vehicle);
        return vehicleList;
    }
    public static List<Store> addStores() {
        List<Store> storeList = new ArrayList<>();
        Store store1 = new Store();
        store1.setStoreId(1);
        storeList.add(store1);
        return storeList;
    }
    public static List<User> addUsers(){
        List<User> userList = new ArrayList<>();
        User user1 = new User();
        user1.setUserId(1);
        userList.add(user1);
        return userList;
    }
}