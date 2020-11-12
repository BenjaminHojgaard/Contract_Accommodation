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
    private Enum<RoomType> roomType;
    /**
     * Indicates information regarding the hotel
     */
    private HotelDTO hotel;
}
