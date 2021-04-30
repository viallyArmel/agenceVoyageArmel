package exceptions;

public class ConnectionException extends Exception{
    private String msgError;

    public ConnectionException(String msgError){
        this.msgError = msgError;
    }

    public String getMessage(){
        return msgError;
    }
}
