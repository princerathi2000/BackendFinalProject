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
import com.softwareacademy.dto.Teacher;
import com.softwareacademy.service.ClassesServiceImpl;
import com.softwareacademy.service.TeacherServiceImpl;

@WebServlet("/ServletGetAllTeacher")
public class ServletGetAllTeacher extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Teacher> allTeacher=new TeacherServiceImpl().getAllTeachers();
		if(allTeacher.size()>0)
		{
			request.setAttribute("allTeacher",allTeacher);
			RequestDispatcher dispatcher=request.getRequestDispatcher("teacher.jsp");
			dispatcher.forward(request, response);
		}
		else
		{
			String msg="No Data Found";
			request.setAttribute("msg",msg);
			RequestDispatcher dispatcher=request.getRequestDispatcher("index.jsp");
			dispatcher.forward(request, response);
		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
