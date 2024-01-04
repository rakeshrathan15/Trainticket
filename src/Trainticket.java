public class Trainticket {
    private int seatNumber;

    private String row;

    private String time;


    @Override
    public String toString() {
        return "Trainticket{" +
                "seatNumber=" + seatNumber +
                ", row='" + row + '\'' +
                ", time='" + time + '\'' +
                '}';
    }

    public Trainticket(int seatNumber, String row, String time) {
        this.seatNumber = seatNumber;
        this.row = row;
        this.time = time;
    }


}

