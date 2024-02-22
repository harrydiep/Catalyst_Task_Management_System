package Main;

import Controllers.Controller;
import Database.Task;
import Database.TaskDB;

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

        //TaskDatabase test = new TaskDatabase();
        TaskDB test = new TaskDB();
        ResultSet results;

        try {
            //test.addTask("H","dsdasdasd","2024-01-24","2024-02-01" );

            results = test.displayTask();
            //System.out.println(results.getString("taskName")+" "+results.getString("taskDescription")+" "+ results.getString("startDate")+" "+results.getString("endDate"));
            while (results.next()){
                System.out.println(results.getString("taskName")+" "+results.getString("taskDescription")+" "+ results.getString("startDate")+" "+results.getString("endDate"));

            }


            //test.addUser("Imma", "Hero");



        }
        catch (SQLException | ClassNotFoundException throwables) {
            throwables.printStackTrace();
        }


    }
}
