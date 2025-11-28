package com.mphasis.Maven_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import  java.sql.DatabaseMetaData;



/**
 * Hello world!
 */
public class App {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Class.forName("com.mysql.cj.jdbc.Driver"); // for loading driver
		// go to maven repository(Google search) search for mysql Connector->choose
		// 8.0.33 paste it in pom.xml
		System.out.println("Driver loaded");
		// credentials
		String uname = "root";
		String pwd = "root@39";
		String url = "jdbc:mysql://localhost:3306/demo";

		Connection con = DriverManager.getConnection(url, uname, pwd); // connecting
		System.out.println("Connection established");

		String query = "select * from emp";
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(query);
		ResultSetMetaData rsmd = rs.getMetaData();	//this will give info abt table so tha rs.getMetaData()
		int columnCount = rsmd.getColumnCount();
		System.out.println("Total number of columns:" + columnCount);
		for (int i = 1; i <= columnCount; i++) {
			System.out.println(rsmd.getColumnName(i) + " :"+rsmd.getColumnClassName(i));
		}
		//This will give info about db ; con is the one connecting with db so use that con.MetaData
		DatabaseMetaData dbmd=con.getMetaData();
		System.out.println(dbmd.getDatabaseProductName()); //op:MySQL->This is the product we are using
		//dbmd.getTables(null,null,"root",)
		ResultSet rs1=dbmd.getTables("demo", null, "%", new String[] {"TABLE"});

		while (rs1.next()) {
            String catalog = rs1.getString("TABLE_CAT");
            String schema = rs1.getString("TABLE_SCHEM");
            String tableName = rs1.getString("TABLE_NAME");
            String type = rs1.getString("TABLE_TYPE");

            System.out.println("Catalog: " + catalog +
                               ", Schema: " + schema +
                               ", Table: " + tableName +
                               ", Type: " + type);
        }
		while (rs.next()) {
			System.out.println("EmployeeId:" + rs.getInt(1) + "\t");
			System.out.println("EmployeeName:" + rs.getString(2) + "\t");// getString(2) here 2 is the column name
			System.out.println("EmployeeSalary:" + rs.getDouble(3) + "\t");
			System.out.println("DeptId:" + rs.getInt(4) + "\t");
			System.out.println("Joining:" + rs.getDate(5) + "\t");
		}
		
		
		rs.close();
		stmt.close();
		con.close();

		// using trywithResources
		/*
		 * String url = "jdbc:mysql://localhost:3306/demo"; String uname = "root";
		 * String pwd = "root@39";
		 * 
		 * // try-with-resources block try (Connection con =
		 * DriverManager.getConnection(url, uname, pwd); Statement stmt =
		 * con.createStatement(); ResultSet rs = stmt.executeQuery("SELECT * FROM emp"))
		 * {
		 * 
		 * System.out.println("Connection established");
		 * 
		 * while (rs.next()) { System.out.print("EmployeeId:" + rs.getInt(1) + "\t");
		 * System.out.print("EmployeeName:" + rs.getString(2) + "\t");
		 * System.out.print("EmployeeSalary:" + rs.getDouble(3) + "\t");
		 * System.out.print("DeptId:" + rs.getInt(4) + "\t");
		 * System.out.print("Joining:" + rs.getDate(5) + "\t"); System.out.println(); }
		 * 
		 * } catch (SQLException e) { e.printStackTrace(); }
		 */

	}
}
