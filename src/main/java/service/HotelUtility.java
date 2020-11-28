package service;

import dto.BookingDTO;
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
     * @param roomNumbers
     * @param passportNumber
     * @return
     * Creates a booking using roomNumber and possportNumber
     */
    boolean createBooking(ArrayList<String> roomNumbers, String passportNumber, int numberOfGuests, boolean lateArrival);
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
