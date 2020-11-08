package com.strutsP06CustomInterceptor.interceptor;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;
import com.opensymphony.xwork2.util.ValueStack;

@SuppressWarnings("serial")
public class UppercaseInterceptor implements Interceptor {

	
	@Override
	public void init() {}

	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		ValueStack vs = invocation.getStack();
		String username = vs.findString("username");
		vs.set("username", username.toUpperCase());
		return invocation.invoke();
	}
	
	@Override
	public void destroy() {}


}
