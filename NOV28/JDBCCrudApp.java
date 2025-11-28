package com.mphasis.Maven_JDBC;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;

public class JDBCCrudApp {

	public static void main(String[] args)throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		System.out.println("Driver loaded");
		
		String uname = "root";
		String pwd = "root@39";
		String url = "jdbc:mysql://localhost:3306/demo";

		try(Connection con = DriverManager.getConnection(url, uname, pwd);
				Statement stmt = con.createStatement();
				ResultSet rs = stmt.executeQuery("select * from emp");){
			String query="insert into emp values(?, ?, ?, ?, ? )";
//			PreparedStatement ps=con.prepareStatement(query);
//			ps.setInt(1,890);
//			ps.setString(2, "Bhargav");
//			ps.setDouble(3, 60987.00);
//			ps.setInt(4, 2);
//			//ps.setString(5,"2021-01-15");->this willnot work for date
//			ps.setDate(5, java.sql.Date.valueOf("2021-01-15")); //setting date approach 1
//			ps.executeUpdate();	//this will execute the query
//			System.out.println("Success");
//			//setting date approach 2
//			/*LocalDate localDate = LocalDate.of(2021, 1, 15);
//			ps.setDate(5, Date.valueOf(localDate));*/
			
			//update name
//			String query1="update emp set Name=? where id=?";
//			PreparedStatement ps=con.prepareStatement(query1);
//			ps.setString(1,"Kee"); //?->1 ,Value(name)
//			ps.setInt(2, 3);	//?->2,value(Empid)
//			ps.execute();
			
			//delete row
			String query2="delete from emp where id=?";
			PreparedStatement ps=con.prepareStatement(query2);
			ps.setInt(1, 3);
			ps.execute()
;			
			//procedure 
			CallableStatement cs=con.prepareCall("{ call printgrade(?)}");
			cs.setInt(1, 72);
			ResultSet rs1=cs.executeQuery();
			while(rs1.next())
			{
				String gradeResult=rs1.getString("result");
				System.out.println(gradeResult);
			}
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		

	}

}
