package AtmManagement;
import java.sql.*;
public class DataBase {
	Connection c;
	Statement s;
	
	public DataBase(){
		try {
			Class.forName("com.mysql.jdbc.Driver");
			c=DriverManager.getConnection("jdbc:mysql://localhost:3306/atmmanagement","root","");
			s=c.createStatement();
		}catch(Exception e) {
			System.out.println(e);
			
		}

			
			
		
		
	}

	public static void main(String[] args) {
		
DataBase db=new DataBase();

}
}