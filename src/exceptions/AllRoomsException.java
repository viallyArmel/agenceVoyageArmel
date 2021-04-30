package exceptions;

public class AllRoomsException extends Exception{
    private String msgError;

    public AllRoomsException(String msgError){
        this.msgError = msgError;
    }

    @Override
    public String getMessage() {
        return msgError;
    }
}
