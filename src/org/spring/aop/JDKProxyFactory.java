package org.spring.aop;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class JDKProxyFactory implements InvocationHandler{
	private Object targetObject;
	
	public Object createProxyInstance(Object targetObject){
		this.targetObject = targetObject;
		return Proxy.newProxyInstance(this.targetObject.getClass().getClassLoader(), 
				this.targetObject.getClass().getInterfaces(), this);
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		// TODO Auto-generated method stub
		PersonServiceBean bean = (PersonServiceBean) this.targetObject;
		Object result = null;
		if(bean.getUserName() != null){
			result = method.invoke(targetObject, args);
		}
		return result;
	}
}
