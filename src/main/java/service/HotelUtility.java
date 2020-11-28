package service;

import dto.BookingDTO;
import dto.CreateBookingDTO;
import dto.HotelDTO;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

public interface HotelUtility{
    /**
     * @param city
     * @param date
     * @param numberOfGuests
     * @return
     *
     */
    Collection<HotelDTO> findVacantHotels(String city, Date date, int numberOfGuests);

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
