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
import com.softwareacademy.service.ClassesServiceImpl;

@WebServlet("/ServletGetAllClasses")
public class ServletGetAllClasses extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Classes> allClasses=new ClassesServiceImpl().getAllClassess();
		if(allClasses.size()>0)
		{
			request.setAttribute("allClasses",allClasses);
			RequestDispatcher dispatcher=request.getRequestDispatcher("classes.jsp");
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
