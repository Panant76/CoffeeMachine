package coffeemachine.exception;

public class ContainerIsFullException extends Exception {
    public ContainerIsFullException() {
        super("Мусорка полна");
    }
}
