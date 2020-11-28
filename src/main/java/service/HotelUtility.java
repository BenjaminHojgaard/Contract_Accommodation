package service;

import dto.BookingDTO;
import dto.HotelDTO;

import java.rmi.Remote;
import java.rmi.RemoteException;
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
     * @param roomNumber
     * @param passportNumber
     * @return
     * Creates a booking using roomNumber and possportNumber
     */
    boolean createBooking(String roomNumber, String passportNumber, int numberOfGuests, boolean lateArrival);
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
