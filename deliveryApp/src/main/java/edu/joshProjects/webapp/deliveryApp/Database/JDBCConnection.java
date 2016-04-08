package edu.joshProjects.webapp.deliveryApp.Database;

import java.sql.*;

public class JDBCConnection{
	public static void main(String args[]){
		System.out.println("started");
		try{
			//Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:8081/xe","josh","fiitjee69");
			System.out.println("pass");
			Statement st = con.createStatement();
			//String sql = "select * from users";
			ResultSet rs = st.executeQuery("select * from menu");
			System.out.println("in the middle");
			rs.next();
			
				System.out.println(rs.getString("item_name"));// + " " + rs.getString(2) + " " + rs.getInt(3));
				System.out.println("inside while");
			
			con.close();
			System.out.println("finished");
		}
		catch(Exception e){
			System.out.println(e);
			System.out.println("did something happen");
		}
	}
}
