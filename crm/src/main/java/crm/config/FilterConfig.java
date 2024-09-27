package crm.config;

import java.io.IOException;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;

@WebFilter(urlPatterns = "/role")
public class FilterConfig implements Filter {
	
	@Override
	public void init(jakarta.servlet.FilterConfig filterConfig) throws ServletException {
			
	}
	
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
			chain.doFilter(request, response); 
		
	}
	
}
