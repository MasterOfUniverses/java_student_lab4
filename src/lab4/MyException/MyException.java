package lab4.MyException;

public class MyException extends RuntimeException{
    private static final String myStartMessage = "MyException: ";
    private static final String myDefaultMessage = "My default Exception";
    public MyException(){
        super(myDefaultMessage);
    }
    public MyException(String message){
        super(myStartMessage+message);
    }
    public MyException(String message,Throwable cause){
        super(myStartMessage+message, cause);
    }
    public MyException(String message,Throwable cause,boolean enableSuppression, boolean writableStackTrace){
        super(myStartMessage+message, cause, enableSuppression,writableStackTrace);
    }
    public MyException(Throwable cause){
        super(myDefaultMessage,cause);
    }
}
