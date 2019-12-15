package modifieres;

public class InstanceNumber {
    static private int numberInstances;

    public InstanceNumber(){
        numberInstances++;
    }

    public static int getNumberInstances() {
        return numberInstances;
    }

    public static void setNumberInstances(int numberInstances) {
        InstanceNumber.numberInstances = numberInstances;
    }

}
