package com.tm.dataccesslayer;
import java.sql.*;

import com.tm.entity.LoginInfo;

public class LoginInfoDAL

{
	Connection con;
	
public boolean getLoginInfo(String username, String password) throws Exception
{
	Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
	con=DriverManager.getConnection("jdbc:sqlserver://localhost\\sqlexpress:1434;databaseName=TransportManagement;integratedSecurity=true");
	Statement st=con.createStatement();
	ResultSet rs=st.executeQuery("insert into tbl_UserLoginInfo values"+"("+"'piyush',"+"'piyush'"+")"+"");
	
	return con.isClosed();
	
}

public void insertInfo(String name,String empid,String password,String projectid,String Location,String currentoffice)
{
	
}



	
}
