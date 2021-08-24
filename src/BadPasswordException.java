public class BadPasswordException extends Exception{
    String message;

    public BadPasswordException(String message) {
        super(message);
        this.message = message;
    }
}
