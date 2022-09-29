package test;

import java.sql.*;

public class DBConMYsql1 {

	public static void main(String[] args) {
		
		try {
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/edvenswatech","root","krunalkk");
			Statement stm=con.createStatement();
			ResultSet rs=stm.executeQuery("Select * from employees");
			
			while(rs.next()) {
				String s=rs.getString("employees_name");
				System.out.println(s);
//				System.out.println(rs.getInt(1)+"\t")
//									+rs.getString(2)+"\t"
//									+rs.getString(3)+"\t"
//									+rs.getString(4)+"\t"
//									+rs.getDate(5);
			}
			con.close();
			stm.close();
			rs.close();
			
		}
		catch(Exception e){e.printStackTrace();	}
	}
	
}






