import Controllers.Controller;

import java.sql.*;

public class Main {
    public static void main(String[] args) {
        /*Connection c = null;
        Statement statement = null;

        try {
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:TaskDBTest.db");

            System.out.println("Works");
        }

        catch (Exception e){
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }*/
        Controller c = new Controller();

        TaskDatabase test = new TaskDatabase();
        ResultSet results;

        try {
            results = test.displayUsers();
            System.out.println(results.getString("taskName")+" "+results.getString("taskDescription")+" "+ results.getString("startDate")+" "+results.getString("endDate"));

            /*while (results.next()){
            }*/
        }
        catch (SQLException | ClassNotFoundException throwables) {
            throwables.printStackTrace();
        }
    }
}
