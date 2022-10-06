package com.softwareacademy.controller;


import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.softwareacademy.dto.AssignStudent;
import com.softwareacademy.dto.AssignTeacher;
import com.softwareacademy.dto.Student;
import com.softwareacademy.service.AssignStudentServiceImpl;
import com.softwareacademy.service.AssignTeacherServiceImpl;
import com.softwareacademy.service.StudentServiceImpl;

@WebServlet("/ServletAddAsignTeacher")
public class ServletAddAsignTeacher extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public ServletAddAsignTeacher() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String teachername=request.getParameter("teachername");
		String classname=request.getParameter("classname");
		String subjectname=request.getParameter("subjectname");
		
		AssignTeacher assignteacher=new AssignTeacher(teachername,classname,subjectname);
		Integer assignTeacherId=new AssignTeacherServiceImpl().addAssignTeacher(assignteacher); 
		System.out.println(""+assignTeacherId);
		String msg=null;
		if(assignTeacherId>0)
		{
//			System.out.println("UserclassId);
			msg="Teacher Assigned Successfully";
			request.setAttribute("msg",msg);
			RequestDispatcher dispatcher=request.getRequestDispatcher("ServletGetAllAssignTeacher");
			dispatcher.forward(request, response);
		}
		else
		{
			msg="Not Added";
			request.setAttribute("msg",msg);
			RequestDispatcher dispatcher=request.getRequestDispatcher("ServletGetAllAssignTeacher");
			dispatcher.forward(request, response);
		}	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
