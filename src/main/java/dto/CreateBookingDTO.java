package dto;

import java.util.ArrayList;
import java.util.Date;

public class CreateBookingDTO {

    private ArrayList<String> roomNumbers;
    private String passportNumber;
    private int numberOfGuests;
    private Date arrival;
    private Date departure;
    private boolean lateArrival;

    public CreateBookingDTO(ArrayList<String> roomNumbers, String passportNumber, int numberOfGuests, Date arrival, Date departure, boolean lateArrival) {
        this.roomNumbers = roomNumbers;
        this.passportNumber = passportNumber;
        this.numberOfGuests = numberOfGuests;
        this.arrival = arrival;
        this.departure = departure;
        this.lateArrival = lateArrival;
    }

    public CreateBookingDTO() {
    }

    public ArrayList<String> getRoomNumbers() {
        return roomNumbers;
    }

    public void setRoomNumbers(ArrayList<String> roomNumbers) {
        this.roomNumbers = roomNumbers;
    }

    public String getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }

    public int getNumberOfGuests() {
        return numberOfGuests;
    }

    public void setNumberOfGuests(int numberOfGuests) {
        this.numberOfGuests = numberOfGuests;
    }

    public Date getArrival() {
        return arrival;
    }

    public void setArrival(Date arrival) {
        this.arrival = arrival;
    }

    public Date getDeparture() {
        return departure;
    }

    public void setDeparture(Date departure) {
        this.departure = departure;
    }

    public boolean isLateArrival() {
        return lateArrival;
    }

    public void setLateArrival(boolean lateArrival) {
        this.lateArrival = lateArrival;
    }
}
