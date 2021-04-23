package exceptions;

public class AllCustomersException extends Exception{
    @Override
    public String getMessage() {
        return "Error, there are no customers in the table !";
    }
}
