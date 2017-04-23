package com.tm.dataccesslayer;
import java.io.FileWriter;
import java.sql.*;
import com.dbconnection.*;
import com.tm.entity.UserInfo;

public class RegisterUser

{
	Connection con;
	
public int registerUser(UserInfo uf) throws Exception
{

	DBConnect dc=DBConnect.getDBInstance();	
	con=dc.getConnection();
	
	CallableStatement cst=con.prepareCall("{?=call RegisterUser(?,?,?,?,?,?) }");
	cst.registerOutParameter(1,java.sql.Types.INTEGER);
	cst.setString(2,uf.getUserid());
	cst.setString(3,uf.getFname());	
	cst.setString(4,uf.getFname());	
	cst.setLong(5,uf.getContactNo());	
	cst.setLong(6,uf.getDealerId());	
	cst.setString(7,uf.getPassword());
	cst.execute();	
	int i=cst.getInt(1);
	System.out.print(i);
	dc.closeConnection(con);
	return i;

}




	
}
