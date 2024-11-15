import java.util.Date;

public class Reservation {
    private int reservationId;
    private Vehicle vehicle;
    private Date bookingDate;
    private Date dateBookedFrom;
    private Date dateBookedTo;
    private Long fromTimeStamp;
    private Long toTimeStamp;
    private Location pickUpLocation;
    private Location dropLocation;
    private ReservationType reservationType;
    private ReservationStatus reservationStatus;
    private Location location;
    private User user;

    public int getReservationId() {
        return reservationId;
    }

    public void setReservationId(int reservationId) {
        this.reservationId = reservationId;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public Date getBookingDate() {
        return bookingDate;
    }

    public void setBookingDate(Date bookingDate) {
        this.bookingDate = bookingDate;
    }

    public Date getDateBookedFrom() {
        return dateBookedFrom;
    }

    public void setDateBookedFrom(Date dateBookedFrom) {
        this.dateBookedFrom = dateBookedFrom;
    }

    public Date getDateBookedTo() {
        return dateBookedTo;
    }

    public void setDateBookedTo(Date dateBookedTo) {
        this.dateBookedTo = dateBookedTo;
    }

    public Long getFromTimeStamp() {
        return fromTimeStamp;
    }

    public void setFromTimeStamp(Long fromTimeStamp) {
        this.fromTimeStamp = fromTimeStamp;
    }

    public Long getToTimeStamp() {
        return toTimeStamp;
    }

    public void setToTimeStamp(Long toTimeStamp) {
        this.toTimeStamp = toTimeStamp;
    }

    public Location getPickUpLocation() {
        return pickUpLocation;
    }

    public void setPickUpLocation(Location pickUpLocation) {
        this.pickUpLocation = pickUpLocation;
    }

    public Location getDropLocation() {
        return dropLocation;
    }

    public void setDropLocation(Location dropLocation) {
        this.dropLocation = dropLocation;
    }

    public ReservationType getReservationType() {
        return reservationType;
    }

    public void setReservationType(ReservationType reservationType) {
        this.reservationType = reservationType;
    }

    public ReservationStatus getReservationStatus() {
        return reservationStatus;
    }

    public void setReservationStatus(ReservationStatus reservationStatus) {
        this.reservationStatus = reservationStatus;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public int createReserve(User user, Vehicle vehicle){
        reservationId = 1232;
        this.user = user;
        this.vehicle = vehicle;
        reservationType =
                ReservationType.DAILY;
        reservationStatus = ReservationStatus.SCHEDULED;
        return reservationId;
    }
    // CRUD operations
}
