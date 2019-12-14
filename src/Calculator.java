public class Calculator {
    public int res1(int x, int y) {
        return x + y;
    }

    public double res2(int x, int y) {
        return x + y;
    }


    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("Wynik dodawania: " + calc.res1(1, 3)); //trzeba poprawic to
        System.out.println("Wynik dodawania: " + calc.res2(1, 3)); //trzeba dodac wynik
    }
}

