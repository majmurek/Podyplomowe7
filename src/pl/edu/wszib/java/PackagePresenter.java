package pl.edu.wszib.java;

public class PackagePresenter {
    public PackagePresenter(){
        System.out.println("Dzień dobry!");
    }
    public void showPackage() {
        System.out.println("To jest obiekt klasy " + this.getClass().getName() + " , w pakiecie " + this.getClass().getPackage());
    }
}
