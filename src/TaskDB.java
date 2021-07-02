import java.sql.*;

public class TaskDB {
    private static Connection con;
    private static boolean hasData = false;

    private void getConnection() throws ClassNotFoundException, SQLException {
        Class.forName("org.sqlite.JDBC");  //sets up JDBC driver in the driver manager
        con = DriverManager.getConnection("jdbc:sqlite:TaskDBTest.db");
    }

    public void addTask(String taskName, String taskDescription, String startDate, String endDate) throws SQLException, ClassNotFoundException {
        if (con == null) {
            getConnection();
        }

        if (!hasData) { //if hasData is false
            hasData = true;

            Statement state = con.createStatement();
            ResultSet res = state.executeQuery("SELECT name FROM sqlite_master WHERE type='table' AND name='task'");
            //sql_master is the master table in a sqlite data
            //it keeps a record of all tables.
            //This tells us if there are any tables with the name user. If there are, it will use that one.

            if (!res.next()) {
                System.out.println("Building the User table with prepopulated values");
                //need to build table
                Statement state2 = con.createStatement();

                state2.execute("CREATE TABLE task(id integer, " + "taskName varchar(60)," + "taskDescription varchar(240)," + "startDate DATE," + "endDate DATE," + "primary key(id));");

                //Trying to insert a task
                PreparedStatement prep3 = con.prepareStatement("INSERT INTO task values(?,?,?,?,?);");
                prep3.setString(2, taskName); //column 2 = firstname
                prep3.setString(3, taskDescription);
                prep3.setString(4, startDate);// column 3 = last name
                prep3.setString(5, endDate);
                prep3.execute();

            }
        }
    }

    public void deleteTask(String taskName) throws SQLException, ClassNotFoundException {
        //Deletes the task
        if(con == null){
            getConnection();

        }

        String deleteSQl = "DELETE FROM task WHERE taskName = ?";

        PreparedStatement preparedStatement = con.prepareStatement(deleteSQl);
        preparedStatement.setString(2, taskName);
        preparedStatement.executeUpdate();

    }

    public ResultSet displayTask() throws SQLException, ClassNotFoundException {
        if(con == null){
            getConnection();
        }

        Statement state = null;
        try {
            state = con.createStatement();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        ResultSet res = state.executeQuery("SELECT taskName, taskDescription, startDate, endDate FROM task");
        return res;
    }



}
