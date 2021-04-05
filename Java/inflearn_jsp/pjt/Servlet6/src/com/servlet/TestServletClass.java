package com.servlet;

import java.io.IOException;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/tsc")
public class TestServletClass extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
		System.out.println("__doGet()__");
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	
	@PostConstruct
	public void fucPC() {
		System.out.println("__@PostConstruct__");

	}
	
	@Override
	public void init() throws ServletException {
		System.out.println("__init()__");
	}
	
	@Override
	public void destroy() {
		System.out.println("__destroy()__");
	}
	
	@PreDestroy
	public void fucPd() {
		System.out.println("__@PreDestroy__");

	}

}
