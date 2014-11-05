package hk.ed.cpdb.controller;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletResponse;

public class AcaoFilter implements Filter {

	@Override
	public void destroy() {
	}

	@Override
	public void init(FilterConfig config) throws ServletException {
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain filterChain) throws IOException,
			ServletException {
		HttpServletResponse resp = (HttpServletResponse) response;
		// Access-Control-Allow-Origin
		resp.setHeader("Access-Control-Allow-Origin", "*");

		filterChain.doFilter(request, response);
		// System.out.println("Encodeing Filter Deployed");
	}
}