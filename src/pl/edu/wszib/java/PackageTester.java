package pl.edu.wszib.java;

public class PackageTester {
    public PackageTester(){
        System.out.println("Witam!");
    }
    public void introduce() {
        System.out.println("To jest obiekt klasy " + this.getClass().getName() + " , w pakiecie " + this.getClass().getPackage());
    }
}
