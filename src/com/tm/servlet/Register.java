package com.tm.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DatabaseMetaData;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.dbconnection.*;
import com.tm.dataccesslayer.RegisterUser;
import com.tm.entity.UserInfo;

/**
 * Servlet implementation class Register
 */
@WebServlet("/Register")
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Register() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 * 
	 * 
	 * 
	 */
    

    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
		try
		{
			
		UserInfo userInfo=new UserInfo();		
		userInfo.setContactNo(Long.parseLong(request.getParameter("ContactNo")));
		userInfo.setDealerId(Long.parseLong(request.getParameter("DealerId")));
		userInfo.setFname(request.getParameter("Fname"));
		userInfo.setLname(request.getParameter("Lname"));
		userInfo.setPassword(request.getParameter("Password"));
		userInfo.setUserid(request.getParameter("UserId"));
		
		RegisterUser ru=new RegisterUser();
		int i=ru.registerUser(userInfo);
		System.out.println(i);
		
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}

}
