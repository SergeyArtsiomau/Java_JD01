package KontrolWork;

public class Player {
    private String name;
    private int age;
    private boolean isActive;


    public Player(int age, boolean isActive) {
        this.name = "Name";
        this.age = age;
        this.isActive = isActive;
    }

    public int getAge() {

        return age;
    }

    public boolean isActive() {

        return isActive;
    }

    @Override
    public java.lang.String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", isActive=" + isActive +
                '}';
    }
}

