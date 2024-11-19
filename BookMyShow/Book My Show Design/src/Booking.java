import java.util.ArrayList;
import java.util.List;

public class Booking {
    private Show show;
    private Payment payment;
    private List<Seat> bookedSeatList;
    public Booking(){
        bookedSeatList = new ArrayList<>();
        payment = new Payment();
    }

    public Show getShow() {
        return show;
    }

    public void setShow(Show show) {
        this.show = show;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    public List<Seat> getBookedSeatList() {
        return bookedSeatList;
    }

    public void setBookedSeatList(List<Seat> bookedSeatList) {
        this.bookedSeatList = bookedSeatList;
    }
}
