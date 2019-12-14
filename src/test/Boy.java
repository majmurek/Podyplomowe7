package test;

public class Boy extends Human {
    void eat() {
        System.out.println("Chłopiec je!");
    }

    public static void main(String[] args) {
        Boy boy = new Boy();
        boy.eat();

        Human human = new Human();
        human.eat();
    }
}
