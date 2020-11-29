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


}
