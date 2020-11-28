package dto;
import java.util.Date;
import java.util.List;

public class RoomBookingDTO {

    /**
     * Indicates the arrival date for a room
     */
    private Date arrivalDate;
    /**
     * Indicates the departure date for a room
     */
    private Date departureDate;
    /**
     * indicates the rooms booked
     */
    private RoomDTO room;

    public RoomBookingDTO(Date arrivalDate, Date departureDate, RoomDTO room) {
        this.arrivalDate = arrivalDate;
        this.departureDate = departureDate;
        this.room = room;
    }

    public RoomBookingDTO() {
    }

    public Date getArrivalDate() {
        return arrivalDate;
    }

    public void setArrivalDate(Date arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

    public Date getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(Date departureDate) {
        this.departureDate = departureDate;
    }

    public RoomDTO getRoom() {
        return room;
    }

    public void setRooms(RoomDTO room) {
        this.room = room;
    }
}
