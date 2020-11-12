package service;

import dto.BookingDTO;
import dto.HotelDTO;

import java.util.Collection;
import java.util.Date;

public interface HotelUtility {
    /**
     * @param city
     * @param date
     * @param numberOfGuests
     * @return
     *
     */
    Collection<HotelDTO> hotels(String city, Date date, int numberOfGuests);

    /**
     * @param roomNumber
     * @param passportNumber
     * @return
     * Creates a booking using roomNumber and possportNumber
     */
    boolean createBooking(String roomNumber, String passportNumber);

    /**
     * @param bookingID
     * @return
     * Cancels a booking using a booking ID
     */
    boolean cancelBooking(int bookingID);

    /**
     * @param bookingID
     * @return
     * Fetching a booking by booking ID
     */
    BookingDTO fetchBooking(int bookingID);
}
