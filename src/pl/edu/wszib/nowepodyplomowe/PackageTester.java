package pl.edu.wszib.nowepodyplomowe;

public class PackageTester {
    public void introduce() {
        System.out.println("To jest obiekt klasy " + this.getClass().getName() + " , w pakiecie " + this.getClass().getPackage());
    }
}
