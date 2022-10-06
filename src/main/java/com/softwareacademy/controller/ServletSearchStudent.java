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


@WebServlet("/ServletSearchStudent")
public class ServletSearchStudent extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public ServletSearchStudent() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Integer cid=Integer.parseInt(request.getParameter("studentid"));
		
		Student student=new StudentServiceImpl().searchStudent(cid); 
		String msg=null;
		if(student != null)
		{
//			System.out.println("UserstudentId);
//			msg="User Added Successfully";
			request.setAttribute("student",student);
			RequestDispatcher dispatcher=request.getRequestDispatcher("searchstudent.jsp");
			dispatcher.forward(request, response);
		}
		else
		{
			msg="Student not found";
			request.setAttribute("msg",msg);
			RequestDispatcher dispatcher=request.getRequestDispatcher("searchstudent.jsp");
			dispatcher.forward(request, response);
		}	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
