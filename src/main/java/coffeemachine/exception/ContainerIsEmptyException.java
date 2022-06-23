package coffeemachine.exception;

public class ContainerIsEmptyException extends Exception {
    public ContainerIsEmptyException(String name) {
        super(name+" пустой");
    }
}
