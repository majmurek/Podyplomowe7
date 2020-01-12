package budget;

import com.microsoft.sqlserver.jdbc.SQLServerDataSource;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Workers {
    public static void main(String[] args) {

        SQLServerDataSource ds = new SQLServerDataSource();
        ds.setUser("majmurek");
        ds.setPassword("************");
        ds.setServerName("morfeusz.wszib.edu.pl");
        ds.setPortNumber(1433);
        ds.setDatabaseName("AdventureWorks");

        String sql = "SELECT TOP 10 * FROM Person.contact where lastname like 'Anderson'";

        try (Connection con = ds.getConnection();
             Statement stmt = con.createStatement()) {

            ResultSet rs = stmt.executeQuery(sql);

            String lastname;
            String firstname;

            while (rs.next()) {
                if ((lastname = rs.getString("lastname")) != null) {
                    firstname = rs.getString("firstname");
                    System.out.println(firstname + " " + lastname);
                }

            }


        } catch (SQLException e) {
            System.out.println("Błąd !: " + e.getMessage());
        }
    }

}
