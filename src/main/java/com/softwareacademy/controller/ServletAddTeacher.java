package com.softwareacademy.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.softwareacademy.dto.Teacher;
import com.softwareacademy.service.TeacherServiceImpl;


 @WebServlet("/ServletAddTeacher")
public class ServletAddTeacher extends HttpServlet {
	private static final long serialVersionUID = 1L;
     
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Integer tid=Integer.parseInt(request.getParameter("teacherid"));
		String tname=request.getParameter("teachername");
		
		Teacher teacher=new Teacher(tname);
		Integer teacherid=new TeacherServiceImpl().addTeacher(teacher); 
		String msg=null;
		if(teacherid>0)
		{
//			System.out.println("UserclassId);
			msg="Teacher Added Successfully";
			request.setAttribute("msg",msg);
			RequestDispatcher dispatcher=request.getRequestDispatcher("index.jsp");
			dispatcher.forward(request, response);
		}
		else
		{
			msg="Teacher Not Added";
			request.setAttribute("msg",msg);
			RequestDispatcher dispatcher=request.getRequestDispatcher("index.jsp");
			dispatcher.forward(request, response);
		} 
	}
 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
 		doGet(request, response);
	}

}
