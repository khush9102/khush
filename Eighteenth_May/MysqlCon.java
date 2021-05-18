import java.sql.*;
public class MysqlCon
{
    public static void main(String args[])
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:1521:training", "root", "");
            if (con != null)
                System.out.println("Connected");
            else
                System.out.println("Not Connected");
            con.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
