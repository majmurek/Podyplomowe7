package Lab11;

public class A {
    A(){
        System.out.println("Działa A");
    }

}

class B extends A{
    B(){
        System.out.println("Działa B");
    }
}


class C extends B {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();

    }

    C(){
        System.out.println("Działa C");
    }
}
