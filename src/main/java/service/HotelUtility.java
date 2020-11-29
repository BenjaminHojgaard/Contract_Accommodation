package service;

import dto.BookingDTO;
import dto.CreateBookingDTO;
import dto.HotelDTO;
import dto.VacantHotelsDTO;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

public interface HotelUtility{
    /**
     * @param vacantHotelsDTO
     * @return
     *
     */
    Collection<HotelDTO> findVacantHotels(VacantHotelsDTO vacantHotelsDTO);


}
