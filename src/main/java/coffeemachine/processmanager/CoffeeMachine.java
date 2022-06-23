package coffeemachine.processmanager;

import coffeemachine.entity.CoffeContainer;
import coffeemachine.entity.GarbageContainer;
import coffeemachine.entity.MilkContainer;
import coffeemachine.entity.WaterContainer;
import coffeemachine.service.IOService;
import coffeemachine.service.IOServiceImpl;

public class CoffeeMachine {
    private CoffeContainer coffeContainer;
    private GarbageContainer garbageContainer;
    private MilkContainer milkContainer;
    private WaterContainer waterContainer;
    private IOService ioService;

    public CoffeeMachine() {
        this.coffeContainer = new CoffeContainer(10);
        this.garbageContainer = new GarbageContainer(5);
        this.milkContainer = new MilkContainer(3);
        this.waterContainer = new WaterContainer(6);
        this.ioService = new IOServiceImpl();
    }

}
