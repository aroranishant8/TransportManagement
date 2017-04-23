package com.tm.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tm.dataccesslayer.LoginInfoDAL;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")


public class Login extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	LoginInfoDAL lid;
    /**
     * @see HttpServlet#HttpServlet()
     */
	

    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		lid=new LoginInfoDAL();
		PrintWriter out = response.getWriter();
		try
		{		
		String uname=request.getParameter("uname");
		String password=request.getParameter("password");	
		RequestDispatcher rd1=request.getRequestDispatcher("Welcome.jsp");
		RequestDispatcher rd2=request.getRequestDispatcher("Login.jsp");
		if((lid.getLoginInfo(uname,password))==1)
		{
			rd1.include(request, response);
			response.sendRedirect("Welcome.jsp");
		}
		else
		{
			rd2.forward(request, response);
			
		}
		
		}
		catch(Exception e)
		{
			out.print(e);
		
		}
		doGet(request, response);
	}

}
