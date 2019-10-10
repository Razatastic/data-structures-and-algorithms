package LinkedList;

public class OutOfRangeException extends Exception {
    OutOfRangeException() {
        this("Your input is out of range!");
    }

    OutOfRangeException(String msg) {
        super(msg);
    }
}
