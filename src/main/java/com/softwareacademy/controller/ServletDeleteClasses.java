package com.softwareacademy.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.softwareacademy.service.ClassesServiceImpl;

 @WebServlet("/ServletDeleteClasses")
public class ServletDeleteClasses extends HttpServlet {
	private static final long serialVersionUID = 1L;
     
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Integer cid=Integer.parseInt(request.getParameter("classid"));
		boolean classId=new ClassesServiceImpl().deleteClasses(cid);
		String msg=null;
		if(classId==true)
		{
//			System.out.println("UserclassId);
			msg="User Deleted Successfully";
			request.setAttribute("msg",msg);
			RequestDispatcher dispatcher=request.getRequestDispatcher("deleteclasses.jsp");
			dispatcher.forward(request, response);
		}
		else
		{
			msg="No Field Found";
			request.setAttribute("msg",msg);
			RequestDispatcher dispatcher=request.getRequestDispatcher("deleteclasses.jsp");
			dispatcher.forward(request, response);
		}	
	}
 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
 		doGet(request, response);
	}

}
