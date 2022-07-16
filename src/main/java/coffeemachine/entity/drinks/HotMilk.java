package coffeemachine.entity.drinks;

import coffeemachine.entity.enums.Container;
import coffeemachine.exception.ContainerProblemException;
import coffeemachine.processmanager.CoffeeMachine;

public class HotMilk extends Drink {
    public HotMilk() {
        super(0, 3, 0);
    }

    public void make(CoffeeMachine coffeeMachine) throws ContainerProblemException {
        Container.MILK.changeCapacity(this);
    }
}
