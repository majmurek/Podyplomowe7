public class RangeLister {

    int[] makeRange(int lower, int upper) {
        int[] range = new int[(upper - lower) + 1];
        for (int i = 0; i < range.length; i++) {
            range[i] = lower++;
        }
        return range;
    }

    void showRange(int[] range) {
        System.out.print("Tablica: [");

        for (int e : range) {
            System.out.print(e + " ");
        }

        System.out.println("]");

    }

    public static void main(String[] args) {
        int[] range;
        RangeLister rangeLister = new RangeLister();
        range = rangeLister.makeRange(5, 7);
        rangeLister.showRange(range);
    }
}
