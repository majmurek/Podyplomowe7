package farm;

abstract public class Animal {
    String name;

    public Animal (){

    }

    public Animal(String name) {
        this.name = "bezimienny";
    }

    String showName() {
        return "zwierze " + name;
    }

    String makeSound() {
        return "???";
    }

    void introduce() {
        System.out.println("Jestem " + showName() + ": " + makeSound());
    }
}
