import java.sql.*;
class JoinExample
{
    public static void main(String args[])
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training","root","");
            String sql = "select empname, city, department from emp e inner join dept d on e.dept_id = d.dept_id";
            Statement stmt = con.createStatement();
            ResultSet result = stmt.executeQuery(sql);
            System.out.println("EmpName  City   Department");
            while (result.next())
            {
                System.out.println(result.getString(1)+"   "+result.getString(2)+"     "+result.getString(3));
            }
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
    }
}