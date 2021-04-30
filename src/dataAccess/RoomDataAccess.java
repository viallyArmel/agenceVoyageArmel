package dataAccess;

import exceptions.AllRoomsException;
import exceptions.ConnectionException;
import model.Room;

import java.util.ArrayList;

public interface RoomDataAccess {
    ArrayList<Room> getAllRooms() throws ConnectionException;
    Room getOneRoom(int number, int hotel) throws ConnectionException;
    void addRoom(Room room) throws ConnectionException;
    void updateRoom(Room room)throws ConnectionException;
    void deleteRoom(Room room) throws ConnectionException;
}
