package service;

import dto.BookingDTO;
import dto.HotelDTO;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.Collection;
import java.util.Date;

public interface HotelUtility extends Remote{
    /**
     * @param city
     * @param date
     * @param numberOfGuests
     * @return
     *
     */
    Collection<HotelDTO> fetchHotels(String city, Date date, int numberOfGuests) throws RemoteException;

    /**
     * @param roomNumber
     * @param passportNumber
     * @return
     * Creates a booking using roomNumber and possportNumber
     */
    boolean createBooking(String roomNumber, String passportNumber) throws RemoteException;

    /**
     * @param bookingID
     * @return
     * Cancels a booking using a booking ID
     */
    boolean cancelBooking(int bookingID) throws RemoteException;

    /**
     * @param bookingID
     * @return
     * Fetching a booking by booking ID
     */
    BookingDTO fetchBooking(int bookingID) throws RemoteException;
}
