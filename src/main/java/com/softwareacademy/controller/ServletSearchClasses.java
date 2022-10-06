package com.softwareacademy.controller;


import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.softwareacademy.dto.Classes;
import com.softwareacademy.service.ClassesServiceImpl;


@WebServlet("/ServletSearchClasses")
public class ServletSearchClasses extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public ServletSearchClasses() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Integer cid=Integer.parseInt(request.getParameter("classid"));
		
		Classes classes=new ClassesServiceImpl().searchClasses(cid); 
		String msg=null;
		if(classes != null)
		{
//			System.out.println("UserclassId);
//			msg="User Added Successfully";
			request.setAttribute("classes",classes);
			RequestDispatcher dispatcher=request.getRequestDispatcher("searchclasses.jsp");
			dispatcher.forward(request, response);
		}
		else
		{
			msg="Class not found";
			request.setAttribute("msg",msg);
			RequestDispatcher dispatcher=request.getRequestDispatcher("searchclasses.jsp");
			dispatcher.forward(request, response);
		}	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
