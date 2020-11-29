package dto;

import java.util.Date;

public class VacantHotelsDTO {

    /** indicates what hotel number the room is at
     */
    private String city;
    /** indicates what date the room is resarved
     */
    private Date date;
    /**
     * indicates how many people
     */
    private int numberOfGuests;

    public VacantHotelsDTO(String city, Date date, int numberOfGuests) {
        this.city = city;
        this.date = date;
        this.numberOfGuests = numberOfGuests;
    }

    public VacantHotelsDTO() {
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
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