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


@WebServlet("/ServletAddClasses")
public class ServletAddClasses extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public ServletAddClasses() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Integer cid=Integer.parseInt(request.getParameter("classid"));
		String cname=request.getParameter("classname");
		
		Classes classes=new Classes(cname);
		Integer classId=new ClassesServiceImpl().addClasses(classes); 
		String msg=null;
		if(classId>0)
		{
//			System.out.println("UserclassId);
			msg="User Added Successfully";
			request.setAttribute("msg",msg);
			RequestDispatcher dispatcher=request.getRequestDispatcher("addclasses.jsp");
			dispatcher.forward(request, response);
		}
		else
		{
			msg="Not Added";
			request.setAttribute("msg",msg);
			RequestDispatcher dispatcher=request.getRequestDispatcher("addclasses.jsp");
			dispatcher.forward(request, response);
		}	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
