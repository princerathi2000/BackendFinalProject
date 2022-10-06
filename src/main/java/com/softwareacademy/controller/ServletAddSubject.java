package com.softwareacademy.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.softwareacademy.dto.Subject;
import com.softwareacademy.service.SubjectServiceImpl;


@WebServlet("/ServletAddSubject")
public class ServletAddSubject extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Integer sid=Integer.parseInt(request.getParameter("subjectid"));
		String sname=request.getParameter("subjectname");
		
		Subject subject=new Subject(sname);
		Integer subjectId=new SubjectServiceImpl().addSubject(subject); 
		String msg=null;
		if(subjectId>0)
		{
//			System.out.println("UserclassId);
			msg="Subject Added Successfully";
			request.setAttribute("msg",msg);
			RequestDispatcher dispatcher=request.getRequestDispatcher("index.jsp");
			dispatcher.forward(request, response);
		}
		else
		{
			msg="Subject Not Added";
			request.setAttribute("msg",msg);
			RequestDispatcher dispatcher=request.getRequestDispatcher("index.jsp");
			dispatcher.forward(request, response);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
