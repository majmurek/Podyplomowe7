package modifieres;

public class Tester {
    public static void main(String[] args) {
        A a = new A();
        a.setNumber(20);

        System.out.println(a.getNumber());
         Rectangle r = new Rectangle(2,4);
        System.out.println("Pole powierzchni prostokąta to " + r.getArea());
    }
}

class A {
    private int number;

    public int getNumber(){
        return number;
    }
    public void setNumber(int number){
        this.number = number;
    }
}

class B extends A{
    public void setNumber(int number){
        System.out.println("asdasfdf fdsfsd");
    }
}
