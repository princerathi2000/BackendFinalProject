package com.softwareacademy.controller;


import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.softwareacademy.dto.Student;
import com.softwareacademy.service.StudentServiceImpl;



@WebServlet("/ServletAddStudent")
public class ServletAddStudent extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public ServletAddStudent() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		Integer sid=Integer.parseInt(request.getParameter("studentid"));
		String sname=request.getParameter("studentname");
		
		Student student=new Student(sname);
		Integer studentId=new StudentServiceImpl().addStudent(student); 
//		System.out.println(""+studentId);
		String msg=null;
		if(studentId>0)
		{
//			System.out.println("UserclassId);
			msg="Student Added Successfully";
			request.setAttribute("msg",msg);
			RequestDispatcher dispatcher=request.getRequestDispatcher("addstudent.jsp");
			dispatcher.forward(request, response);
		}
		else
		{
			msg="Not Added";
			request.setAttribute("msg",msg);
			RequestDispatcher dispatcher=request.getRequestDispatcher("addstudent.jsp");
			dispatcher.forward(request, response);
		}	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
