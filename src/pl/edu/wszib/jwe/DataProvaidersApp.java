package pl.edu.wszib.jwe;

public class DataProvaidersApp {
    public static void main(String[] args) {

        DataProvider dataProvider = new FileDataProvider();
        DataPresenter dataPresenter = new DataPresenter();
        dataPresenter.showData(dataProvider);


    }
}
