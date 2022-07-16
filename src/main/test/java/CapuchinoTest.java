import coffeemachine.entity.drinks.Capuchino;
import coffeemachine.exception.ContainerProblemException;
import coffeemachine.processmanager.CoffeeMachine;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static coffeemachine.entity.enums.Container.GARBAGE;
import static coffeemachine.entity.enums.Container.WATER;

public class CapuchinoTest {
    @Test
    void Capuchino_EmptyThrowExeption() {
        Capuchino capuchino=new Capuchino();
        WATER.setCapacity(0);
        Assertions.assertThrows(ContainerProblemException.class, () -> capuchino.make(new CoffeeMachine()));

    }
    @Test
    void Capuchino_FullThrowExeption() {
        Capuchino capuchino=new Capuchino();
        GARBAGE.setCapacity(0);
        Assertions.assertThrows(ContainerProblemException.class, () -> capuchino.make(new CoffeeMachine()));

    }
}
