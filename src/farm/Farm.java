package farm;

public class Farm {
    public static void main(String[] args) {

        Animal[] animals = new Animal[5];
        animals[0] = new Dog("Burek");
        animals[1] = new Cat("Filemon");
        animals[2] = new Pig("Peppa");
        animals[3] = new Dog("Lena");
        animals[4] = new Pig("George");

        for (Animal animal : animals) {
            animal.introduce();
        }
    }
}
