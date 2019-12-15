package pl.edu.wszib.nowepodyplomowe;

import pl.edu.wszib.podyplomowe.Test;

public class PackageTesterApp {

    public static void main(String[] args) {

        System.out.println("Pakiet: " + Test.class.getPackage());

        pl.edu.wszib.java.PackageTester javaPackageTester =
                new pl.edu.wszib.java.PackageTester();

        pl.edu.wszib.podyplomowe.PackageTester podyplomowePackageTester =
                new pl.edu.wszib.podyplomowe.PackageTester();

        pl.edu.wszib.nowepodyplomowe.PackageTester nowepodyplomowePackageTester =
                new pl.edu.wszib.nowepodyplomowe.PackageTester();


        javaPackageTester.introduce();
        podyplomowePackageTester.introduce();
        nowepodyplomowePackageTester.introduce();

    }
}
