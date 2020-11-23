package dto;

import java.io.Serializable;
import java.util.List;

public class BookingDTO implements Serializable {

    /**
     * Supplied by guest for booking
     */
    private String passportNumber;
    /**
     * Contains information about each booked room
     */
    private List<RoomBookingDTO> roomBookings;
    /**
     * Is marked true when guest are ariving late
     */
    private boolean lateArrival;
    /**
     * Indicates the number of guests
     */
    private int numberOfGuests;

    public BookingDTO(String passportNumber, List<RoomBookingDTO> roomBookings, boolean lateArrival, int numberOfGuests) {
        this.passportNumber = passportNumber;
        this.roomBookings = roomBookings;
        this.lateArrival = lateArrival;
        this.numberOfGuests = numberOfGuests;
    }

    public BookingDTO() {
    }

    public String getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }

    public List<RoomBookingDTO> getRoomBookings() {
        return roomBookings;
    }

    public void setRoomBookings(List<RoomBookingDTO> roomBookings) {
        this.roomBookings = roomBookings;
    }

    public boolean isLateArrival() {
        return lateArrival;
    }

    public void setLateArrival(boolean lateArrival) {
        this.lateArrival = lateArrival;
    }

    public int getNumberOfGuests() {
        return numberOfGuests;
    }

    public void setNumberOfGuests(int numberOfGuests) {
        this.numberOfGuests = numberOfGuests;
    }
}
