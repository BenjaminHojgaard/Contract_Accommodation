package service;


import dto.RoomDTO;

import java.util.Collection;
import java.util.Date;
import java.util.List;

public interface RoomUtility {
    /**
     * @param city
     * @param date
     * @param numberOfGuests
     * @return
     */
    Collection<RoomDTO> rooms(String city, Date date, int numberOfGuests);

    /**
     * @param roomNumbers
     * @return
     */
    boolean markRoomAsReserved(List<String> roomNumbers);
}
