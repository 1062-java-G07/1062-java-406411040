
import java.sql.*;

public class ConnMySql
{
	public static void main(String[] args) throws Exception
	{
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
		}catch (Exception ex){
		    ex.printStackTrace();
		}
		
		Connection conn = null;
		
		try{
			 conn = DriverManager.getConnection("jdbc:mysql://zoo/G07?" +
                     "user=bear&password=bear123&serverTimezone=UTC");

			 Statement stmt = conn.createStatement();
			 ResultSet rs = stmt.executeQuery("select s.* , teacher_name from student_table s , teacher_table t  where t.teacher_id = s.java_teacher and teacher_name='htCHUNG'");

			
			while(rs.next())
			{
				System.out.println(rs.getInt(1) + "\t" + rs.getString(2) + "\t"
					+ rs.getString(3) + "\t" + rs.getString(4));
			}
		}catch (SQLException ex){
			    
			    System.out.println("SQLException: " + ex.getMessage());
			    System.out.println("SQLState: " + ex.getSQLState());
			    System.out.println("VendorError: " + ex.getErrorCode());
			}
		
	}
}
