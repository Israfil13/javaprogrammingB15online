package day54;

public  abstract class Animal {
    public abstract void speak();
}

class Dog extends Animal implements IndoorPet{
    String name;

    @Override
    public void speak() {
        System.out.println("Bark");
    }

    @Override
    public void play() {
        System.out.println("runnning after the ball");
    }
}
