package database;

import java.sql.*;

public class MyfirstJdbcConnection {
    public static void main(String[] args) {
        //UWAGA na Hasło
        String connectionUrl = "jdbc:sqlserver://morfeusz.wszib.edu.pl:1433;databaseName=AdventureWorks;user=majmurek;password=,Grzesiek.92";

        try (Connection con = DriverManager.getConnection(connectionUrl);
             Statement stmt = con.createStatement()) {

            String SQL = "SELECT TOP 10 * FROM Person.Contact";
            ResultSet rs = stmt.executeQuery(SQL);

            while(rs.next()) {
                System.out.println(rs.getString("FirstName") + " " + rs.getString("LastName"));
            }


            System.out.println("--------------------------");

        } catch (SQLException e) {
            System.out.println("Błąd! wiadomość: " + e.getMessage() + " status:" + e.getSQLState());
        }


    }
}
