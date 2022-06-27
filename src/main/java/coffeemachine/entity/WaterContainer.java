package coffeemachine.entity;

import coffeemachine.entity.drinks.Drink;

public class WaterContainer extends Container{
    public WaterContainer(int capacity) {
        super(capacity);
        this.name="контейнер для воды";
    }

    public void make(Drink drink) {

    }
}
