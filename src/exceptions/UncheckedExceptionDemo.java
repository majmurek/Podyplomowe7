package exceptions;

public class UncheckedExceptionDemo {
    public static void main(String[] args) {
        UncheckedExceptionDemo ued = new UncheckedExceptionDemo();
        int i = ued.getNumberForamtString("gg");
        if (i != -1) {
            System.out.println("To nasza liczba pomnożona przez 5 ->" + (i * 5));
        }
    }
    public int getNumberForamtString(String number){
        try {
            return Integer.parseInt(number);
        } catch(NumberFormatException nfe) {
            System.out.println("Coś poszło nie tak! Upewnij się że przekazywany String jest liczbą!");
        }
        return -1;
    }

}
