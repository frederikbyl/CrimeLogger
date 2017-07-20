package com.yonifre.crime.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(Ordered.HIGHEST_PRECEDENCE)
public class CORSFilter implements Filter {


	private String ALLOWED_ORIGINS = "http://localhost:63342";
	private String allowedHttpMethodList = "GET, POST, PUT, DELETE, OPTIONS";
	private String allowedHttpHeaderList = "Origin, Content-Type, Accept, X-Requested-With, Authorization";
	private String preflightMaxAge = "3600";

	private final String ORIGIN = "Origin";


	
	@Override
	public void destroy() {
		// TODO Auto-generated method stub

	}

	@Override
	public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain)
			throws IOException, ServletException {
		
		if (req instanceof HttpServletRequest) {
			String origin = ((HttpServletRequest) req).getHeader(ORIGIN);
			if (origin != null && ALLOWED_ORIGINS.contains(origin)) {
				HttpServletResponse response = (HttpServletResponse) res;

				response.setHeader("Access-Control-Allow-Origin", origin);
				response.setHeader("Access-Control-Allow-Methods", allowedHttpMethodList);
				response.setHeader("Access-Control-Max-Age", preflightMaxAge);
				response.setHeader("Access-Control-Allow-Headers", allowedHttpHeaderList);
			}

			if ("OPTIONS".equalsIgnoreCase(((HttpServletRequest) req).getMethod())) {
				((HttpServletResponse) res).setStatus(HttpServletResponse.SC_OK);
			} else {
				chain.doFilter(req, res);
			}

		}
	}


	@Override
	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub

	}

}
