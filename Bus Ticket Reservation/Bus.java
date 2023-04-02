package BusReservation;

public class Bus {
    private int busNo;
    private boolean ac;
    private int capacity;

    public int getBusNo() {
        return busNo;
    }

    public void setBusNo(int busNo) {
        this.busNo = busNo;
    }

    public boolean isAc() {
        return ac;
    }

    public void setAc(boolean ac) {
        this.ac = ac;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    Bus(int no, boolean ac, int cap){
        this.busNo = no;
        this.ac = ac;
        this.capacity = cap;
    }

    public void displayBusInfo(){
        System.out.println("Bus No: "+ busNo);
        System.out.println("AC: "+ ac);
        System.out.println("Total Capacity: "+ capacity);
        System.out.println("*********");
    }

}
