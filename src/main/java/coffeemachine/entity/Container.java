package coffeemachine.entity;

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
