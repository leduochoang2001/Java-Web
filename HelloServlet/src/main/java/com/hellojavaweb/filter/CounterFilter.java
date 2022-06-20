package com.hellojavaweb.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

@WebFilter(urlPatterns = {"/*"})

public class CounterFilter implements Filter{
	
	private int count;

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		count ++;
		
		System.out.println(count);
		
		chain.doFilter(request, response);
		
	}
	
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		count = 0;
	}

}
