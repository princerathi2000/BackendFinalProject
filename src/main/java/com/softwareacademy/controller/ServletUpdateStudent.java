package com.softwareacademy.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.softwareacademy.service.StudentServiceImpl;

 @WebServlet("/ServletUpdateStudent")
public class ServletUpdateStudent extends HttpServlet {
	private static final long serialVersionUID = 1L;
     
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		Integer cid=Integer.parseInt(request.getParameter("studentid"));
		String cname=request.getParameter("studentname");
		
		boolean studentId= new StudentServiceImpl().updateStudent(cid,cname); 
		String msg=null;
		if(studentId==true)
		{
//			System.out.println("UserstudentId);
			msg="Student Updated Successfully";
			request.setAttribute("msg",msg);
			RequestDispatcher dispatcher=request.getRequestDispatcher("updatestudent.jsp");
			dispatcher.forward(request, response);
		}
		else
		{
			msg="No Field Found";
			request.setAttribute("msg",msg);
			RequestDispatcher dispatcher=request.getRequestDispatcher("updatestudent.jsp");
			dispatcher.forward(request, response);
		}	
	}
 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
 		doGet(request, response);
	}

}
