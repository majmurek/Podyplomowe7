package pl.edu.wszib.jwe;

public class LettersApp {
    public static void main(String[] args) {
        Letter a = new A();
        a.introduce();

        Letter b = new B();
        b.introduce();

        A aaa = new B();
        aaa.introduce();

    }
}

interface Letter{
    void introduce();
}

class A implements Letter {
    @Override
    public void introduce() {
        System.out.println("Jestem A");
    }
}

class B extends A implements Letter {
    @Override
    public void introduce() {
        System.out.println("Jestem B");
    }
}