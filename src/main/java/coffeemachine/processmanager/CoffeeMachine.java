package coffeemachine.processmanager;
import coffeemachine.entity.drinks.BlackCoffee;
import coffeemachine.entity.drinks.Capuchino;
import coffeemachine.entity.drinks.Drink;
import coffeemachine.entity.drinks.HotMilk;
import coffeemachine.entity.enums.Button;
import coffeemachine.exception.ContainerProblemException;
import coffeemachine.service.IOService;
import coffeemachine.service.IOServiceImpl;

public class CoffeeMachine {
    private IOService ioService;
    private static final String DRINK_Message = ("Ваш напиток готов!");

    public CoffeeMachine() {
        this.ioService = new IOServiceImpl();
    }

    public void run() {
        welcomMessage();
        chooseOperation();
    }

    public void chooseOperation() {
        Button operation = ioService.read();
        switch (operation) {
            case EXIT:
                break;
            case BLACK_COFFE:
                createCoffee();
                break;
            case CAPUCHINO:
                createCapuchino();
                break;
            case HOT_MILK:
                createHotMilk();
                break;
            default:
                ioService.write("Не известная операция");
                run();
        }
    }

    private void createCoffee() {
        Drink blackCoffee = new BlackCoffee();
        try {
            blackCoffee.make(this);
            ioService.write(DRINK_Message);
        } catch (ContainerProblemException e) {
            ioService.write(e.getMessage());
        }
        run();
    }

    private void createHotMilk() {
        Drink hotMilk = new HotMilk();
        try {
            hotMilk.make(this);
            ioService.write(DRINK_Message);
        } catch (ContainerProblemException e) {
            ioService.write(e.getMessage());
        }
        run();
    }

    private void createCapuchino() {
        Drink capuchino = new Capuchino();
        try {
            capuchino.make(this);
            ioService.write(DRINK_Message);
        } catch (ContainerProblemException e) {
            ioService.write(e.getMessage());
        }
        run();
    }

    private void welcomMessage() {
        ioService.write("Выберите напиток");
        ioService.write("1 - Черный кофе");
        ioService.write("2 - Капучино");
        ioService.write("3 - Горячее молоко");
        ioService.write("4 - Смена контейнера");
        ioService.write("0 - Выход");
    }
}
