import java.awt.*;

public class FourDPoint extends Point {
    int z;
    int t;

    static FourDPoint create(int x, int y, int z, int t) {
        FourDPoint fourDPoint = new FourDPoint();
        fourDPoint.x = x;
        fourDPoint.y = y;
        fourDPoint.z = z;
        fourDPoint.t = t;
        return fourDPoint;
    }

    void show() {
        System.out.println("x wynosi: " + x);
        System.out.println("y wynosi: " + y);
        System.out.println("z wynosi: " + z);
        System.out.println("t wynosi: " + t);
    }

    public static void main(String[] args) {
        FourDPoint fourDPoint = create(1,2,3, 4);
    }

}
