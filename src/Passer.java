public class Passer {
    void toUpperCase(String[] strings) {
        for (int i = 0; i < strings.length; i++) {
            strings[i] = strings[i].toUpperCase();

        }
    }

    public static void main(String[] arguments) {
        Passer passer = new Passer();
        passer.toUpperCase(arguments);
        for (String string : arguments) {
            System.out.print(string + " ");
        }
        System.out.println();
    }
}
