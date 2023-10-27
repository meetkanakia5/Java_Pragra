package oops.encapsulation;

public class NotSufficientBalanceException extends Exception{
    NotSufficientBalanceException(String message) {
        super(message);
    }
}
