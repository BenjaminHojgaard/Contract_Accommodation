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
    private List<RoomDTO> rooms;

    public RoomBookingDTO(Date arrivalDate, Date departureDate, List<RoomDTO> rooms) {
        this.arrivalDate = arrivalDate;
        this.departureDate = departureDate;
        this.rooms = rooms;
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

    public List<RoomDTO> getRooms() {
        return rooms;
    }

    public void setRooms(List<RoomDTO> rooms) {
        this.rooms = rooms;
    }
}
