package exceptions;

import java.util.Scanner;

public class Sqrt {

    public static void main(String[] args) throws IllegalAccessException {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę nieujemną: ");
        Double d = Double.parseDouble(scanner.nextLine());

        if (d < 0) {
            throw new IllegalAccessException();
        }
        System.out.println(Math.sqrt(d));
    }

}
