public class Bill {
    private int billId;
    private Reservation reservation;
    private double billAmount;
    private boolean isBillPaid;
    public Bill(Reservation reservation){
        this.reservation = reservation;
        this.billAmount = computeBillAmount();
        isBillPaid = false;
    }
    public double computeBillAmount(){
        return 100.0;
    }

    public int getBillId() {
        return billId;
    }

    public void setBillId(int billId) {
        this.billId = billId;
    }

    public Reservation getReservation() {
        return reservation;
    }

    public void setReservation(Reservation reservation) {
        this.reservation = reservation;
    }

    public double getBillAmount() {
        return billAmount;
    }

    public void setBillAmount(double billAmount) {
        this.billAmount = billAmount;
    }

    public boolean isBillPaid() {
        return isBillPaid;
    }

    public void setBillPaid(boolean billPaid) {
        isBillPaid = billPaid;
    }
}
