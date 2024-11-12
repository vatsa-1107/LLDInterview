import java.util.List;

public class VehicleRentalSystem {
    private List<Store> storeList;
    private List<User> userList;
    public VehicleRentalSystem(List<Store> stores, List<User> users){
        storeList = stores;
        userList = users;
    }

    public List<Store> getStoreList() {
        return storeList;
    }

    public void setStoreList(List<Store> storeList) {
        this.storeList = storeList;
    }

    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }
    public Store getStore(Location location){
        //filter it according to the location
        return storeList.get(0);
    }
    // perform CRUD operations here
    //add
    //remove etc
}
