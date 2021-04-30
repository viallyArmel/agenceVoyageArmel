package dataAccess;

import exceptions.ConnectionException;

import java.sql.*;

public class SingletonConnection {

    private static Connection singleConnection;
    private static final String URL = "jdbc:mysql://localhost:3306/agenceVoyage";
    private static final String USER = "root";
    private static final String PASSWORD = "Vially418.";

    public static Connection getInstance() throws ConnectionException {
        if(singleConnection == null){
             try {
                 singleConnection = DriverManager.getConnection(URL, USER, PASSWORD);
             }catch (SQLException e){
                 throw new ConnectionException(e.getMessage());
             }
        }
        return singleConnection;
    }


}
