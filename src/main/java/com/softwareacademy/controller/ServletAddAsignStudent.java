package com.softwareacademy.controller;


import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.softwareacademy.dto.AssignStudent;
import com.softwareacademy.dto.Student;
import com.softwareacademy.service.AssignStudentServiceImpl;
import com.softwareacademy.service.StudentServiceImpl;

@WebServlet("/ServletAddAsignStudent")
public class ServletAddAsignStudent extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public ServletAddAsignStudent() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String studentid=request.getParameter("studentid");
		String subjectid=request.getParameter("subjectid");
		
		AssignStudent assignstudent=new AssignStudent(studentid,subjectid);
		Integer assignStudentId=new AssignStudentServiceImpl().addAssignStudent(assignstudent); 
		System.out.println(""+assignStudentId);
		String msg=null;
		if(assignStudentId>0)
		{
//			System.out.println("UserclassId);
			msg="Student Assigned Successfully";
			request.setAttribute("msg",msg);
			RequestDispatcher dispatcher=request.getRequestDispatcher("assignstudent.jsp");
			dispatcher.forward(request, response);
		}
		else
		{
			msg="Not Added";
			request.setAttribute("msg",msg);
			RequestDispatcher dispatcher=request.getRequestDispatcher("assignstudent.jsp");
			dispatcher.forward(request, response);
		}	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
