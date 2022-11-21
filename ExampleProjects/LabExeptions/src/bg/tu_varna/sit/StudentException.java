package bg.tu_varna.sit;

public class StudentException extends Exception {
    public StudentException(String message) {
        super("Невалидна стойност за " + message);
    }
}
