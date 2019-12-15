package test;

public class Shop {

    public static void main(String[] args) {
        Product milk1 = new Product("Mleko",2.78);
        Product milk2 = new Product("Mleko",2.78);

        System.out.println(milk1 == milk2); // false
        System.out.println(milk1.equals(milk2)); // false
    }
}
