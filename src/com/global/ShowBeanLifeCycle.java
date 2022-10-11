package com.global;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class ShowBeanLifeCycle implements InitializingBean,DisposableBean,BeanPostProcessor {

	// Will execute one time
	@Override
	public void afterPropertiesSet() throws Exception {

		System.out.println("When Bean is initializing !");
	}
	
	// Will execute one time
	@Override
	public void destroy() throws Exception {
		
		System.out.println("When Bean is destroying");
	}
	
	// Will execute one time for each bean
	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("In post Process After Initialization and bean is >> " + beanName);
		return bean;
	}

	
	// Will execute one time for each bean
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("In post Process Before Initialization and bean is >> " + beanName);
		return bean;
	}

}
