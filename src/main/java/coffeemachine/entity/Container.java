package coffeemachine.entity;

import coffeemachine.entity.drinks.Drink;

public abstract class Container {
    int capacity;
    String name;

    public Container(int capacity) {
        this.capacity = capacity;
    }

    public boolean isEmpty(){
        return capacity==0;
    }

    public abstract void make(Drink drink);

}
