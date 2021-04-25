package dataAccess;

import exceptions.AllRoomsException;
import model.Room;

import java.util.ArrayList;

public interface RoomDataAccess {
    ArrayList<Room> getAllRooms() throws AllRoomsException;
    void addRoom(Room room);
    void updateRoom(Room room);
    void deleteRoom(Room room);
}
