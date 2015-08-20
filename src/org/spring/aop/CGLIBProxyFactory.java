package org.spring.aop;

import java.lang.reflect.Method;

import org.spring.aop.PersonServiceBean;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

public class CGLIBProxyFactory implements MethodInterceptor{
	private Object targetObject;
	
	public Object createProxyInstance(Object tarObject){
		this.targetObject = tarObject;
		Enhancer enhancer = new Enhancer();
		enhancer.setSuperclass(this.targetObject.getClass());//对非final方法覆盖
		enhancer.setCallback(this);
		return enhancer.create();
	}

	@Override
	public Object intercept(Object proxy, Method method, Object[] arg,
			MethodProxy methodProxy) throws Throwable {
		// TODO Auto-generated method stub
		PersonServiceBean bean = (PersonServiceBean) this.targetObject;
		Object result = null;
		if(bean.getUserName() != null){
			result = method.invoke(targetObject, arg);
		}
		return result;
	}
}
