package com.softwareacademy.controller;

import java.io.IOException;
import java.util.List;
import java.util.Set;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.softwareacademy.dto.Student;
import com.softwareacademy.dto.Subject;
import com.softwareacademy.service.StudentServiceImpl;
import com.softwareacademy.service.SubjectServiceImpl;

@WebServlet("/ServletGetAllAssignStudent")
public class ServletGetAllAssignStudent extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		List<Student> allStudent=new StudentServiceImpl().getAllStudents();
//		if(allStudent.size()>0)
//		{
//			request.setAttribute("allStudent",allStudent);
//			RequestDispatcher dispatcher=request.getRequestDispatcher("assignstudent.jsp");
//			dispatcher.forward(request, response);
//		}
//		else
//		{
//			String msg="No Data Found";
//			request.setAttribute("msg",msg);
//			RequestDispatcher dispatcher=request.getRequestDispatcher("assignstudent.jsp");
//			dispatcher.forward(request, response);
//		}
//		
//		List<Subject> allSubjet=new SubjectServiceImpl().getAllSubjects();
//		if(allSubjet.size()>0)
//		{
//			request.setAttribute("allSubject",allSubjet);
//			RequestDispatcher dispatcher1=request.getRequestDispatcher("assignstudent.jsp");
//			dispatcher1.forward(request, response);
//		}
//		else
//		{
//			String msg="No Data Found";
//			request.setAttribute("msg",msg);
//			RequestDispatcher dispatcher1=request.getRequestDispatcher("assignstudent.jsp");
//			dispatcher1.forward(request, response);
//		}
		
		// merge both
		List<Student> allStudent=new StudentServiceImpl().getAllStudents();
		List<Subject> allSubjet=new SubjectServiceImpl().getAllSubjects();
		if(allStudent.size()>0 && allSubjet.size()>0)
		{
			request.setAttribute("allStudent",allStudent);
			request.setAttribute("allSubject",allSubjet);
			RequestDispatcher dispatcher=request.getRequestDispatcher("assignstudent.jsp");
			dispatcher.forward(request, response);
		}
		else
		{
			String msg="No Data Found";
			request.setAttribute("msg",msg);
			RequestDispatcher dispatcher=request.getRequestDispatcher("assignstudent.jsp");
			dispatcher.forward(request, response);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
