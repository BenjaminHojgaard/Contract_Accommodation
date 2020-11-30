package dto;


import types.RoomType;

public class RoomDetailsDTO {
    /**
     * Indicate the max capacity of guests that can stay in a room
     */
    private int capacity;
    /**
     * Indicates the type that a room is
     */
    private String roomType;
    /**
     * Indicates information regarding the hotel
     */
    private HotelDTO hotel;

    public RoomDetailsDTO(int capacity, String roomType, HotelDTO hotel) {
        this.capacity = capacity;
        this.roomType = roomType;
        this.hotel = hotel;
    }

    public RoomDetailsDTO() {
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public HotelDTO getHotel() {
        return hotel;
    }

    public void setHotel(HotelDTO hotel) {
        this.hotel = hotel;
    }
}
