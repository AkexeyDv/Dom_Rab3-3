public class WrongLoginPasswordException extends IllegalArgumentException{
    public WrongLoginPasswordException(String s) {
        super(s);
    }
}
