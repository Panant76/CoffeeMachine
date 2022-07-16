package coffeemachine.entity.enums;

import coffeemachine.entity.drinks.Drink;
import coffeemachine.exception.ContainerProblemException;

public enum Container {
    GARBAGE(5, "Контейнер для отходов", 0) {
        @Override
        public void changeCapacity(Drink drink) throws ContainerProblemException {
            if (this.getCurrentState() == this.getCapacity()) {
                throw new ContainerProblemException(this.getName());
            }
            this.setCurrentState(getCurrentState() + 1);
        }

        @Override
        public void reset() {
            this.setCurrentState(0);
        }
    },
    COFFE(10, "Контейнер для кофе", 0) {
        @Override
        public void changeCapacity(Drink drink) throws ContainerProblemException {
            if (this.getCapacity() < drink.getCoffee()) {
                throw new ContainerProblemException(this.getName());
            }
            this.setCapacity(getCapacity() - drink.getCoffee());
        }

        @Override
        public void reset() {
            this.setCapacity(10);
        }
    },
    MILK(3, "Контейнер для молока", 0) {
        @Override
        public void changeCapacity(Drink drink) throws ContainerProblemException {
            if (this.getCapacity() < drink.getMilk()) {
                throw new ContainerProblemException(this.getName());
            }
            this.setCapacity(getCapacity() - drink.getMilk());
        }

        @Override
        public void reset() {
            this.setCapacity(3);
        }
    },
    WATER(6, "Контейнер для воды", 0) {
        @Override
        public void changeCapacity(Drink drink) throws ContainerProblemException {
            if (this.getCapacity() < drink.getWater()) {
                throw new ContainerProblemException(this.getName());
            }
            this.setCapacity(getCapacity() - drink.getWater());
        }

        @Override
        public void reset() {
            this.setCapacity(6);
        }
    };
    private int capacity;
    private String name;
    private int currentState;

    Container(int capacity, String name, int currentState) {
        this.capacity = capacity;
        this.name = name;
        this.currentState = currentState;
    }

    public abstract void changeCapacity(Drink drink) throws ContainerProblemException;

    public abstract void reset();

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getName() {
        return name;
    }


    public int getCurrentState() {
        return currentState;
    }

    public void setCurrentState(int currentState) {
        this.currentState = currentState;
    }


}
