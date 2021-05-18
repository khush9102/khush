import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
public class BatchExecute
{
    public static void main(String[] args)throws Exception
    {
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training","root","");
        con.setAutoCommit(false);
        Statement st=con.createStatement();
        st.addBatch("insert into emp values(101,'jay','jay@gmail.com', 'Pune')");
        st.addBatch("insert into emp values(102,'sharad','sharad@gmail.com', 'Mumbai')");
        st.addBatch("insert into emp values(103,'vijay', 'vijay@gmail.com', 'Noida')");
        st.addBatch("insert into emp values(104,'smit', 'smit@gmail.com', 'Delhi')");
	      st.executeBatch();
        con.commit();
	      con.close();
    }
}

