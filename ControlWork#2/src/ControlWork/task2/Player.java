package ControlWork.task2;

public class Player {
    String name;
    int age;
    boolean isActive;

    public Player(String name, int age, boolean isActive) {
        this.name = name;
        this.age = age;
        this.isActive = isActive;
    }

    public int getAge() {

        return age;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name + ' ' + age + " " + isActive;
    }
}