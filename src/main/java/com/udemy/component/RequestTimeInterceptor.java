package com.udemy.component;


import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;


@Component("requestTimeInterceptor")
public class RequestTimeInterceptor implements HandlerInterceptor {

		private static final Log LOG = LogFactory.getLog(RequestTimeInterceptor.class);
	
		//primera.
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		request.setAttribute("startTime",System.currentTimeMillis());
		return true ;
	}
		//segunda.
	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		long startTime =  (long) request.getAttribute("startTime");
        LOG.info("url to:'" + request.getRequestURL().toString() + " 'in: '" + (System.currentTimeMillis() - startTime) + "ms'");
      
	}

}
