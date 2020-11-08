package com.strutsP15ServletActionContext_SessionAware.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.StrutsStatics;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;

import com.opensymphony.xwork2.interceptor.Interceptor;
import com.strutsP15ServletActionContext_SessionAware.model.Login;

@SuppressWarnings("serial")
public class LoginInterceptor implements Interceptor {

	@Override
	public void destroy() {}

	@Override
	public void init() {}

	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		
		final ActionContext context = invocation.getInvocationContext();        
	    HttpServletRequest request1 = (HttpServletRequest)context.get(StrutsStatics.HTTP_REQUEST);

	    StringBuffer url = request1.getRequestURL();
	    String queryString = request1.getQueryString();

	    String fullUrl = url + (queryString==null ? "" : ("?" + queryString));

	    System.out.println(fullUrl);
	    
		HttpServletRequest request = ServletActionContext.getRequest();
		HttpSession session = request.getSession();
		System.out.println(" interceptor "+ session.getAttribute("login") != null );
		if( session.getAttribute("login") != null  ) {
			System.out.println(" interceptor if");
			return invocation.invoke();
			
		}
		else {
			System.out.println(" interceptor else");
			if(invocation.getAction().getClass().equals(Login.class)) {
				System.out.println(" interceptor else if");
				return invocation.invoke();
			}
			else {
				System.out.println(" interceptor else else");
				//(Login(ActionSupport)).addActionError("Your need to login first");
				return "input";
			}
			
		}
		
	}

}
