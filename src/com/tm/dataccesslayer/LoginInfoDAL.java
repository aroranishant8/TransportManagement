package com.tm.dataccesslayer;
import java.io.FileWriter;
import java.sql.*;
import com.dbconnection.*;

public class LoginInfoDAL

{
	Connection con;
	
public int getLoginInfo(String username, String password) throws Exception
{

	DBConnect dc=DBConnect.getDBInstance();	
	con=dc.getConnection();
	
	CallableStatement cst=con.prepareCall("{?=call ValidateLogin(?,?) }");
	cst.registerOutParameter(1,java.sql.Types.INTEGER);
	cst.setString(2,username);
	cst.setString(3,password);	
	cst.execute();	
	int i=cst.getInt(1);
	System.out.print(i);
	dc.closeConnection(con);
	return i;

}




	
}
