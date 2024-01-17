package lab4.MyException;
public class CustomDivisionException extends MyException{
    private static final String myStartMessage = "Custom Division Exception: ";
    private static final String myDefaultMessage = "Division Exception: division by zero";

    public CustomDivisionException(){
        super(myDefaultMessage);
    }
    public CustomDivisionException(String message){
        super(myStartMessage+message);
    }
    public CustomDivisionException(String message,Throwable cause){
        super(myStartMessage+message, cause);
    }
    public CustomDivisionException(String message,Throwable cause,boolean enableSuppression, boolean writableStackTrace){
        super(myStartMessage+message, cause, enableSuppression,writableStackTrace);
    }
    public CustomDivisionException(Throwable cause){
        super(myDefaultMessage,cause);
    }
}
