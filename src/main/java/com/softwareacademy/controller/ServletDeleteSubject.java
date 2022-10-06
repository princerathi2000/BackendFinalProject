package com.softwareacademy.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.softwareacademy.service.SubjectServiceImpl;

@WebServlet("/ServletDeleteSubject")
public class ServletDeleteSubject extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Integer sid=Integer.parseInt(request.getParameter("subjectid"));
		boolean id=new SubjectServiceImpl().deleteSubject(sid);
		String msg=null;
		if(id==true)
		{
//			System.out.println("UserclassId);
			msg="Subject Deleted Successfully";
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
		System.out.println("Deleted Successfully");
	} 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
 		doGet(request, response);
	}

}
