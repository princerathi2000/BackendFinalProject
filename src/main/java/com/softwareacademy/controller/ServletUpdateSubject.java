package com.softwareacademy.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.softwareacademy.service.ClassesServiceImpl;

@WebServlet("/ServletUpdateSubject")
public class ServletUpdateSubject extends HttpServlet {
	private static final long serialVersionUID = 1L;
     
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Integer sid=Integer.parseInt(request.getParameter("subjectid"));
		String sname=request.getParameter("subjectname");

		boolean id=new ClassesServiceImpl().updateClasses(sid,sname);
		String msg=null;
		if(id==true)
		{
//			System.out.println("UserclassId);
			msg="Subject Updated Successfully";
			request.setAttribute("msg",msg);
			RequestDispatcher dispatcher=request.getRequestDispatcher("updateclasses.jsp");
			dispatcher.forward(request, response);
		}
		else
		{
			msg="No Field Found";
			request.setAttribute("msg",msg);
			RequestDispatcher dispatcher=request.getRequestDispatcher("updateclasses.jsp");
			dispatcher.forward(request, response);
		}	
	}
 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
 		doGet(request, response);
	}

}
