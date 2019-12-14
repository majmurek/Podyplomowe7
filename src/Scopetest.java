public class Scopetest {
    int test = 10;

    void printTest() {
        int test = 20;
        System.out.println("Test: " + test);
    }

    public static void main(String[] args) {
        Scopetest st = new Scopetest();
        st.printTest();
    }
}
