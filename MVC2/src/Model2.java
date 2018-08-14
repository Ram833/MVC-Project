import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Model2 
{
	Connection con = null;
	PreparedStatement pstmt = null;
	String s = null;
	ResultSet res = null;
	String url = "jdbc:oracle:thin:@//localhost:1521/XE";
	String un = "SYSTEM";
	String pw = "system";
	private String name;
	private String usn;
	private String password;
	public Model2()
	{
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection(url, un, pw);
			System.out.println("connected");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public boolean getResult()
	{
		String a = null;
		String b = null;

		String s = "Select * from STUDENT where USERNAME = ?";
		try {
			pstmt = con.prepareStatement(s);
			pstmt.setString(1, usn);
			res = pstmt.executeQuery();
			if (res.next() == true) {
				name = res.getString(1);
				a  = res.getString(2);
				b = res.getString(3);
			}
			if(usn.equals(a)==true && password.equals(b)==true)
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
	public String getUsn() {
		return usn;
	}
	public void setUsn(String usn) {
		this.usn = usn;
	}
	public String getName() {
		return name;
	}
		
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

}

