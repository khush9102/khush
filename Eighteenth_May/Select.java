import java.sql.Connection; 
import java.sql.ResultSet; 
import java.sql.Statement; 
public class Select
{ 
 	connectDatabase cd = new connectDatabase(); 
 	public void select() 
 	{ 
 		try 
 		{ 
 			Connection con = cd.getConnection(); 
 			String select = "SELECT * FROM EMPLOYEE"; 
 			Statement st = con.createStatement(); 
 			ResultSet rs = st.executeQuery(select); 
 			while(rs.next()) 
 			{ 
 				System.out.println("id: "+rs.getInt("id")+" Name: "+rs.getString("Name")+" And Age: "+rs.getInt("Age")); 
 			} 
 		 
 		}
		catch(Exception e) 
 		{ 
 			e.printStackTrace(); 
 		} 
 	} 
 	public static void main(String[] args) 
	{ 
 		Select s = new Select(); 
 		s.select(); 
  
 	} 
  
} 