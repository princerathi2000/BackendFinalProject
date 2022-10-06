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

import com.softwareacademy.dto.Classes;
import com.softwareacademy.dto.Student;
import com.softwareacademy.dto.Subject;
import com.softwareacademy.dto.Teacher;
import com.softwareacademy.service.ClassesServiceImpl;
import com.softwareacademy.service.StudentServiceImpl;
import com.softwareacademy.service.SubjectServiceImpl;
import com.softwareacademy.service.TeacherServiceImpl;

@WebServlet("/ServletGetAllAssignTeacher")
public class ServletGetAllAssignTeacher extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		// merge both
		List<Teacher> allTeacher=new TeacherServiceImpl().getAllTeachers();
		List<Classes> allClass=new ClassesServiceImpl().getAllClassess();
		List<Subject> allSubjet=new SubjectServiceImpl().getAllSubjects();
		if(allTeacher.size()>0 && allClass.size()>0 && allSubjet.size()>0)
		{
			request.setAttribute("allTeacher",allTeacher);
			request.setAttribute("allClass",allClass);
			request.setAttribute("allSubjet",allSubjet);
			RequestDispatcher dispatcher=request.getRequestDispatcher("assignteacher.jsp");
			dispatcher.forward(request, response);
		}
		else
		{
			String msg="No Data Found";
			request.setAttribute("msg",msg);
			RequestDispatcher dispatcher=request.getRequestDispatcher("assignteacher.jsp");
			dispatcher.forward(request, response);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
