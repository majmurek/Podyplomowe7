package Lab12;

public class Library {
    public static void main(String[] args) {
        Book[] books = new Book[4];
        Book book1 = new Book("Abcde","Janek Byk", "AJA",2015);
        Book book2 = new Book("Abcdef","Janek Byk", "AJA",2015);
        Book book3 = new Book("Abcdegh","Janek Bykaa", "AJAaa",2016);
        Book book4 = new Book("Abcdeghi","Janek Bykaaa", "AJAaaa",2016);

        books[0] = book1;
        books[1] = book2;
        books[2] = book3;
        books[3] = book4;


        System.out.println(book1.equals(book2));
        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book2.equals(book3));
        System.out.println(book2);
        System.out.println(book3);
        System.out.println(book3.equals(book4));
        System.out.println(book3);
        System.out.println(book4);


    }
}
