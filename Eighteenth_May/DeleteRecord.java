import java.sql.*;
public class DeleteRecord
{
	public static void main(String[] args)
	{
		try
        	{
            		Class.forName("com.mysql.jdbc.Driver");
            		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training","root","");
            		String sql = "delete from employee where emp_id=1";
            		Statement stmt = con.createStatement();
            		int i = stmt.executeUpdate(sql); 
	    		if(i>0) 
	    		{ 
				System.out.println("Rows Deleted Successfully"); 
            		} 
        	}
        	catch(Exception ex)
        	{
            		ex.printStackTrace();
        	}
	}
}