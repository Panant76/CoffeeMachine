package coffeemachine.entity;

import coffeemachine.entity.drinks.Drink;

public class CoffeContainer extends Container{
    public CoffeContainer(int capacity) {
        super(capacity);
        this.name="контейнер для кофе";
    }

    public void make(Drink drink) {

    }


}
