package test;

public class Calc {
    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c){
        return a + b + c;
    }

    double add(double a, double b){
        return a + b;
    }
    double add(double a, double b, double c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        Calc calcu = new Calc();
        System.out.println(calcu.add(1,3));
        System.out.println(calcu.add(1.23,3.43));
    }
}
