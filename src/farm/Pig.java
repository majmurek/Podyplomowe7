package farm;

public class Pig extends Animal{
    public Pig(String name) {
        super(name);
    }
    @Override
    String showName() {
        return "świnka " + name;
    }

    @Override
    String makeSound() {
        return "chrum chrum";
    }
}
