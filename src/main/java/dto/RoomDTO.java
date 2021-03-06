package dto;

import types.RoomType;

public class RoomDTO {

    /**
     * Indicates information about the Hotel
     */
    private HotelDTO hotelDTO;
    /**
     * Indicates the room number
     */
    private String roomNumber;
    /**
     * Indicates the room type through a String
     */
    private String roomType;

    public RoomDTO(HotelDTO hotelDTO, String roomNumber, String roomType) {
        this.hotelDTO = hotelDTO;
        this.roomNumber = roomNumber;
        this.roomType = roomType;
    }

    public RoomDTO() {
    }

    public HotelDTO getHotelDTO() {
        return hotelDTO;
    }

    public void setHotelDTO(HotelDTO hotelDTO) {
        this.hotelDTO = hotelDTO;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }
}
