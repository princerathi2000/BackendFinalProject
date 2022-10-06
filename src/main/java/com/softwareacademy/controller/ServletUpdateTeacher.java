package com.softwareacademy.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.softwareacademy.service.TeacherServiceImpl;

@WebServlet("/ServletUpdateTeacher")
public class ServletUpdateTeacher extends HttpServlet {
	private static final long serialVersionUID = 1L;
     
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Integer tid=Integer.parseInt(request.getParameter("teacherid"));
		String tname=request.getParameter("teachername");

		boolean id=new TeacherServiceImpl().updateTeacher(tid,tname);
		String msg=null;
		if(id==true)
		{
//			System.out.println("UserclassId);
			msg="User Updated Successfully";
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
