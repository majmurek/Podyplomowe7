package test;

import java.awt.*;

public class Box {
    int x1;
    int y1;
    int x2;
    int y2;

    Box(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    Box(Point topleft, Point bottomRight) {
        this(topleft.x, topleft.y, bottomRight.x, bottomRight.y);
    }



    void printBox() {
        System.out.println("Box: <" + x1 + ", " + y1 + ", " + x2 + ", " + y2 + ">");
    }

    public static void main(String[] args) {
        Box box;
        System.out.println("Tworzenie Box z punktami (10,10) i (20,20): ");
        box = new Box(new Point(10, 10), new Point(20, 20));
        box.printBox();

    }

}
