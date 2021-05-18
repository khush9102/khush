import java.sql.*;
import java.io.*;
class Transaction
{
    public static void main(String args[])
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training","root","");
            con.setAutoCommit(false);
            String sql = "INSERT INTO EMPLOYEE (empid, empname) VALUES (?, ?)";
            PreparedStatement ps = con.prepareStatement(sql);
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            while (true)
            {
                System.out.print("Enter employee Id: ");
                String s1 = br.readLine();
                int empid = Integer.parseInt(s1);

                System.out.print("Enter employee name: ");
                String name = br.readLine();

                ps.setInt(1, empid);
                ps.setString(2, name);
                ps.executeUpdate();
                System.out.println("commit/rollback");
                String answer = br.readLine();
                if (answer.equals("commit"))
                {
                    con.commit();
                }
                if (answer.equals("rollback"))
                {
                    con.rollback();
                }
                System.out.println("Want to add more records y/n");
                String ans = br.readLine();
                if (ans.equals("n"))
                {
                    break;
                }
            }
            con.commit();
            System.out.println("record successfully saved");
            con.close();
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
    }
}