package pl.edu.wszib.podyplomowe;


public class Test {
    public static void main(String[] args) {

        System.out.println("Pakiet: " + Test.class.getPackage());

        pl.edu.wszib.java.PackagePresenter javaPackagePresenter =
               new pl.edu.wszib.java.PackagePresenter();

        pl.edu.wszib.podyplomowe.PackagePresenter podyplomowePackagePresenter =
                new pl.edu.wszib.podyplomowe.PackagePresenter();


        javaPackagePresenter.showPackage();
        podyplomowePackagePresenter.showPackage();

    }

}
