package dataAccess;

import exceptions.AllRoomsException;
import exceptions.ConnectionException;
import model.Room;

import javax.swing.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.GregorianCalendar;

public class RoomDBAccess implements RoomDataAccess{

    private ArrayList<Room> allRooms;
    private Room room;
    private Connection connection;
    private String sqlInstructiion;
    private PreparedStatement preparedStatement;

    public RoomDBAccess() throws ConnectionException{
        connection = SingletonConnection.getInstance();
    }

    @Override
    public void addRoom(Room room) throws ConnectionException{
        sqlInstructiion = "INSERT INTO room(number, hotel, type, nbBeds, price_per_night, hasABalcony, dateLastRenov, descriptionExtras) values (?, ?, ?, ?, ?, ?)";
        try {
            preparedStatement = connection.prepareStatement(sqlInstructiion);
            preparedStatement.setInt(1, room.getNumber());
            preparedStatement.setInt(2, room.getHotel());
            preparedStatement.setString(3, room.getType());
            preparedStatement.setInt(4, room.getNbBeds());
            preparedStatement.setDouble(5, room.getPrice_per_night());
            preparedStatement.setBoolean(6, room.isHasBalcony());
            preparedStatement.executeUpdate();

            if (room.getDateLastRenov() != null){
                java.sql.Date sqlDate = new java.sql.Date(room.getDateLastRenov().getTimeInMillis());
                sqlInstructiion = "UPDATE room SET dateLastRenov = ? WHERE (number = ? AND hotel = ?)";
                preparedStatement = connection.prepareStatement(sqlInstructiion);
                preparedStatement.setDate(1, sqlDate);
                preparedStatement.setInt(2, room.getNumber());
                preparedStatement.setInt(3, room.getHotel());
            }
            if (room.getDescriptionExtras() != null){
                sqlInstructiion = "UPDATE room SET descriptionExtras = ? WHERE (number = ? AND hotel = ?)";
                preparedStatement = connection.prepareStatement(sqlInstructiion);
                preparedStatement.setString(1, room.getDescriptionExtras());
                preparedStatement.setInt(2, room.getNumber());
                preparedStatement.setInt(3, room.getHotel());
            }

        }
        catch (SQLException e){
            throw new ConnectionException(e.getMessage());
        }
    }

    @Override
    public void deleteRoom(Room room) throws ConnectionException{

        sqlInstructiion = "DELETE FROM room WHERE (number = ? AND hotel = ?)";
        try {
            preparedStatement = connection.prepareStatement(sqlInstructiion);
            preparedStatement.setInt(1, room.getNumber());
            preparedStatement.setInt(2, room.getHotel());
            preparedStatement.executeUpdate();
        }
        catch (SQLException e){
            throw new ConnectionException(e.getMessage());
        }
    }

    @Override
    public void updateRoom(Room room) {

    }

    @Override
    public Room getOneRoom(int number, int hotel) throws ConnectionException {
        sqlInstructiion = "SELECT * FROM room WHERE (number = ? AND hotel = ?)";

        try {
            preparedStatement = connection.prepareStatement(sqlInstructiion);
            preparedStatement.setInt(1, room.getNumber());
            preparedStatement.setInt(2, room.getHotel());
            ResultSet data = preparedStatement.executeQuery();

            setRoom(data);
            return room;
        }
        catch (SQLException e){
            throw new ConnectionException(e.getMessage());
        }

    }

    public void setRoom(ResultSet data) throws SQLException{

        room = new Room(data.getInt("number"), data.getInt("hotel"),
                data.getString("type"),
                data.getInt("nbBeds"),
                data.getDouble("price_per_night"),
                data.getBoolean("hasABalcony")
        );

        java.sql.Date sqlDate = data.getDate("dateLastRenov");
        if (!data.wasNull()){
            GregorianCalendar dateLastRenov = new GregorianCalendar();
            dateLastRenov.setTime(sqlDate);
            room.setDateLastRenov(dateLastRenov);
        }

        String extras = data.getString("descriptionExtras");
        if (!data.wasNull())
            room.setDescriptionExtras(extras);
    }

    @Override
    public ArrayList<Room> getAllRooms() throws ConnectionException {
        ResultSet data;

        try {
            sqlInstructiion = "SELECT * FROM room";
            preparedStatement = connection.prepareStatement(sqlInstructiion);
            data = preparedStatement.executeQuery();

            allRooms = new ArrayList<>();
            while (data.next()){

                setRoom(data);
                allRooms.add(room);
            }
            return allRooms;
        }
        catch (SQLException e){
            throw new ConnectionException(e.getMessage());
        }
    }
}
