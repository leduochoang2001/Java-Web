package com.hellojavaweb.session;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet(urlPatterns = {"/session1"})

public class session1 extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		resp.setContentType("text/html");
		
		HttpSession session = req.getSession();
		
		session.setAttribute("name", "hoang");
		
		session.setAttribute("age", new Integer(20));
		
		PrintWriter writer = resp.getWriter();
		
		writer.println("Welcomingg!");
		
	}
}
