package service;

import dto.RoomDTO;
import dto.VacantRoomsDTO;

import java.util.Collection;
import java.util.Date;
import java.util.List;

public interface RoomUtility{
    /**
     * @param vacantRoomsDTO
     * @return
     */
    Collection<RoomDTO> findVacantRooms(VacantRoomsDTO vacantRoomsDTO);

    /**
     * @param roomNumbers
     * @return
     */

    boolean markRoomAsReserved(List<String> roomNumbers);
}
