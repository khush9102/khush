import java.sql.*;
import java.io.*;
public class InsertImage
{
    public static void main(String[] args)
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/training","root","");
            PreparedStatement ps=con.prepareStatement("insert into imgtable values(?,?)");
            ps.setString(1,"sample");
            FileInputStream fin=new FileInputStream("E:\\kt.jpg");
            ps.setBinaryStream(2,fin,fin.available());
            int i=ps.executeUpdate();
            System.out.println(i+" records affected");
            con.close();
        }
	catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}