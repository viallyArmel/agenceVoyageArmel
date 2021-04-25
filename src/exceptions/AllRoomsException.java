package exceptions;

public class AllRoomsException extends Exception{

    @Override
    public String getMessage() {
        return "Error, there are no Rooms in the table !";
    }
}
