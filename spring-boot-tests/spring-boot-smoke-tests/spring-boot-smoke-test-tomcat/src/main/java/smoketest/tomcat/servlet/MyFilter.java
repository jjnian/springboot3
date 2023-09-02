package smoketest.tomcat.servlet;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;

import java.io.IOException;

/**
 *
 */
@WebFilter
public class MyFilter implements Filter{
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		System.out.println("Myfilter");
		chain.doFilter(request,response);
	}
}
