package service;


import dto.RoomDTO;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.Collection;
import java.util.Date;
import java.util.List;

public interface RoomUtility extends Remote {
    /**
     * @param city
     * @param date
     * @param numberOfGuests
     * @return
     */
    Collection<RoomDTO> fetchRooms(String city, Date date, int numberOfGuests) throws RemoteException;

    /**
     * @param roomNumbers
     * @return
     */
    boolean markRoomAsReserved(List<String> roomNumbers) throws RemoteException;
}
