import java.awt.*;

public class Passing {
    public static void main(String[] args) {
        int i = 10;
        System.out.println("Przed zmianą " + i);
        changeIt(i);
        System.out.println("Po zmianie " + i);

        System.out.println("---------------------");

        Point p = new Point(1,1);
        System.out.println("Przed zmianą " + p);
        changeIt(p);
        System.out.println("Po zmianie " + p);

    }

    static void changeIt(int i){
        System.out.println("Zmieniam i....");
        i++;
        System.out.println("lokalne i (kopia): " + i);
        //koniec z lokalnym i
    }

    static void changeIt(Point p){
        p = new Point(4,4); //Jeśli usuniemy tą linie wtedy będzie "Po zmianie ava.awt.Point x=2 i y=2'
        System.out.println("Zmieniam to na co wskazuje p");
        p.x++;
        p.y++;
    }
}
