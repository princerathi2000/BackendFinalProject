package com.softwareacademy.controller;


import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.softwareacademy.dto.Classes;
import com.softwareacademy.dto.Subject;
import com.softwareacademy.service.ClassesServiceImpl;
import com.softwareacademy.service.SubjectServiceImpl;


@WebServlet("/ServletSearchSubject")
public class ServletSearchSubject extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public ServletSearchSubject() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Integer sid=Integer.parseInt(request.getParameter("subjectid"));
		
		Subject subject=new SubjectServiceImpl().searchSubject(sid); 
		String msg=null;
		if(subject != null)
		{
//			System.out.println("UserclassId);
//			msg="User Added Successfully";
			request.setAttribute("subject",subject);
			RequestDispatcher dispatcher=request.getRequestDispatcher("searchsubject.jsp");
			dispatcher.forward(request, response);
		}
		else
		{
			msg="Subject not found";
			request.setAttribute("msg",msg);
			RequestDispatcher dispatcher=request.getRequestDispatcher("searchsubject.jsp");
			dispatcher.forward(request, response);
		}	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
