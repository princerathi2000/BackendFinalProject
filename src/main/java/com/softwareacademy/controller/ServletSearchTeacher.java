package com.softwareacademy.controller;


import java.io.IOException;

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


@WebServlet("/ServletSearchTeacher")
public class ServletSearchTeacher extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public ServletSearchTeacher() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Integer tid=Integer.parseInt(request.getParameter("teacherid"));
		
		Teacher teacher=new TeacherServiceImpl().searchTeacher(tid); 
		String msg=null;
		if(teacher != null)
		{
//			System.out.println("UserclassId);
//			msg="User Added Successfully";
			request.setAttribute("teacher",teacher);
			RequestDispatcher dispatcher=request.getRequestDispatcher("searchteacher.jsp");
			dispatcher.forward(request, response);
		}
		else
		{
			msg="User not found";
			request.setAttribute("msg",msg);
			RequestDispatcher dispatcher=request.getRequestDispatcher("searchteacher.jsp");
			dispatcher.forward(request, response);
		}	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
