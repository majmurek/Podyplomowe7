public class Vars2 {

    int i; //zmienna egzemplarza (pole klasy)
    static int j = 2; //zmienna klasowa (pole statyczne)
    int g = 6;

    public static void main(String[] args) {
        int i = 77;
        Vars2 v = new Vars2();
        v.i = 9;
        System.out.println("Wyśiwetlamy zmienną ezgemplarza dla v: " + v.i);
        Vars2 vv = new Vars2();
        vv.i = 5;
        System.out.println("Wyśiwetlamy zmienną ezgemplarza dla vv: " + vv.i);
        System.out.println("Wyświetlamy zmienną klasową (statyczną): " + j);
        System.out.println("Wyświetlamy zmienną lokalną: " + i);

    }

    public int change() {
        int k = 7;
        return i + (k + j);
    }



    void show() {
        System.out.println(" iiii");
    }


}
