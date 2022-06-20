package com.hellojavaweb.session;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(urlPatterns = {"/session2"})

public class session2 extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		
		HttpSession httpSession = req.getSession();
		
		String nameString = "";
		int age ;
		
		Object obj = httpSession.getAttribute("name");
		Object obj2 = httpSession.getAttribute("age");
		
		nameString = (String) obj;
		age = (int) obj2;
		
		if(obj == null || obj2 == null)
		{
			resp.sendRedirect("/HelloServlet/session1");
		}
		else {
			PrintWriter writer = resp.getWriter();
			
			writer.println("ten" + obj + "tuoi" + obj2 );
		}
		
	}
	
}
