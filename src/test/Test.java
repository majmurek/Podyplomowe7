package test;

import java.awt.*;

public class Test {

    public static void main(String[] args) {
        Employee employee1 = new Employee("Kowalski", 34, 4500);
        Employee employee2 = new Employee("Kowalski", 25, 9500);
        System.out.println(employee1.equals(employee2));
    }

}