package coffeemachine.exception;

public class ContainerProblemException extends Exception {
    public ContainerProblemException(String name) {
        super("Проверьте "+name);
    }
}
