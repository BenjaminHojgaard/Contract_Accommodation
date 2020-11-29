package service;

import dto.BookingDTO;
import dto.CreateBookingDTO;

public interface BookingUtility {

    /**
     * @param booking
     * @return
     * Creates a booking using roomNumber and possportNumber
     */
    boolean createBooking(CreateBookingDTO booking);
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
    BookingDTO findBooking(int bookingID);
}
