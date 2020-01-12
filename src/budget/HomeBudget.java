package budget;

import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import com.microsoft.sqlserver.jdbc.SQLServerException;

import java.math.BigDecimal;
import java.sql.*;
import java.text.NumberFormat;

public class HomeBudget {

    private static final String DB_HOST = "morfeusz.wszib.edu.pl";
    private static final int DB_PORT = 1433;
    private static final String DB_USER = "majmurek";
    private static final String DB_PASS = "************";
    private static final String DB_NAME = "majmurek";

    private static final String INSERT_ENTRY_SQL = "INSERT INTO budget.BudgetEntries (EntryName, Amount) VALUES (?, ?)";
    private static final String GET__ALL_ENTRIES_SQL = "SELECT * FROM budget.BudgetEntries";
    private static final String GET_SUM_SQL = "SELECT SUM(Amount) AS sum FROM budget.BudgetEntries";

    public static void main(String[] args) {

        BudgetEntry budgetEntry = new BudgetEntry();
        budgetEntry.setEntryName(args[0]);
        budgetEntry.setAmount(new BigDecimal(args[1]));

        HomeBudget hb = new HomeBudget();

        try(Connection con = hb.connect(DB_USER, DB_PASS, DB_NAME);
            Statement stmt = con.createStatement()) {

            PreparedStatement ps = con.prepareStatement(INSERT_ENTRY_SQL);
            ps.setString(1, budgetEntry.getEntryName());
            ps.setBigDecimal(2, budgetEntry.getAmount());
            ps.execute();

            BigDecimal balance;
            ResultSet rs = stmt.executeQuery(GET_SUM_SQL);
            if (rs.next()){
                balance = rs.getBigDecimal("sum");
            } else {
                balance = new BigDecimal(0);
            }

            System.out.print("Zapisano! kwota: " + currencyFormat(budgetEntry.getAmount()));
            System.out.println(", nazwa: " + budgetEntry.getEntryName());
            System.out.print(", saldo: " + currencyFormat(balance));

        } catch (SQLException e) {
            System.out.println("Błąd! " + e.getMessage());
        }


    }

    private Connection connect(String username, String password, String dbName) throws SQLServerException {
        SQLServerDataSource ds = new SQLServerDataSource();
        ds.setUser(username);
        ds.setPassword(password);
        ds.setDatabaseName(dbName);
        ds.setServerName(DB_HOST);
        ds.setPortNumber(DB_PORT);
        return ds.getConnection();
    }

    private static String currencyFormat(BigDecimal n){
        return NumberFormat.getCurrencyInstance().format(n);
    }

}
