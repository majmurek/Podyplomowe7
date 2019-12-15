package modifieres;

public class TestObjects {
    public static void main(String[] args) {
        for (int i = 1; i < 500; i++) {
            new InstanceNumber();
        }
        System.out.println("Utworzono obiektów:  " + InstanceNumber.getNumberInstances());
    }
}
