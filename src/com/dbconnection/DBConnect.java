package com.dbconnection;

import java.io.IOException;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnect {
	
	static DBConnect dc=new DBConnect();
	private DBConnect()
	{
		
	}
	
	public static DBConnect getDBInstance()
	{
		
		return dc;
	}
	
	public Connection getConnection() throws IOException,ClassNotFoundException,SQLException
	{
		
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		String uname="aroranishant";
		String pwd="aroranishant";
		//String databaseName="TransportManagement";
		String URL="jdbc:sqlserver://localhost\\sqlexpress:1434;databaseName=TransportManagement";
		Connection con=DriverManager.getConnection(URL,uname,pwd);
		return con;		
		
	}
	
	public static void closeConnection(Connection con) throws SQLException
	{
		con.close();
	}
	

}
