package com.hellojavaweb;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.GregorianCalendar;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/post-cookie"})

public class Cookies extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		
		PrintWriter writer = resp.getWriter();
		
		
		writer.println("Hello");
		
		Cookie cookie = new Cookie("Hoang", "20");
		
		cookie.setMaxAge(10);
		
		resp.addCookie(cookie);
		
		Cookie cookie2 = new Cookie("Hai", "21");
		
		cookie2.setMaxAge(10);
		
		resp.addCookie(cookie2);
		
	}

}
