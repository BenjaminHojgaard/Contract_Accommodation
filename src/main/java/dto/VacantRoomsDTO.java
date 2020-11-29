package dto;

import java.util.Date;

public class VacantRoomsDTO {

    /** indicates what hotel number the room is at
    */
    private int hotelNumber;
    /** indicates what date the room is resarved
    */
    private Date date;
    /**
     * indicates how many people
     */
    private int numberOfGuests;

    public VacantRoomsDTO(int hotelNumber, Date date, int numberOfGuests) {
        this.hotelNumber = hotelNumber;
        this.date = date;
        this.numberOfGuests = numberOfGuests;
    }

    public VacantRoomsDTO() {
    }

    public int getHotelNumber() {
        return hotelNumber;
    }

    public void setHotelNumber(int hotelNumber) {
        this.hotelNumber = hotelNumber;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getNumberOfGuests() {
        return numberOfGuests;
    }

    public void setNumberOfGuests(int numberOfGuests) {
        this.numberOfGuests = numberOfGuests;
    }
}
