import java.sql.*;
public class CreateTable
{
    static final String DB_URL = "jdbc:mysql://localhost/training;
    static final String USER = "root";
    static final String PASS = "";
    public static void main(String[] args)
    {
        try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement stmt = conn.createStatement();)
        {
            String sql = "CREATE TABLE EMPLOYEE(id INTEGER NOT NULL, Name Varchar(50) NOT NULL, Age INTEGER Not Null, PRIMARY KEY ( id ))";

            stmt.executeUpdate(sql);
            System.out.println("Created table in given database...");
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
    }
}