import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import oracle.jdbc.driver.OracleDriver;

public class Model 
{
	private String name;
	private String username;
	private String password;
	Connection con = null;
	PreparedStatement pstmt = null;
	String url = "jdbc:oracle:thin:@//localhost:1521/XE";
	String un = "SYSTEM";
	String pw = "system";
	
	public Model() throws Exception
	{
		DriverManager.registerDriver(new OracleDriver());
		con = DriverManager.getConnection(url,un,pw);
	}
	
	public boolean register()
	{
		try 
		{
			String s = "INSERT INTO STUDENT VALUES (?,?,?)";
			pstmt = con.prepareStatement(s);
			pstmt.setString(1, name);
			pstmt.setString(2, username);
			pstmt.setString(3, password);
			int row = pstmt.executeUpdate();
			
			if(row>0)
			{
				return true;
			}
			else
			{
				return false;
			}
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return false;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
