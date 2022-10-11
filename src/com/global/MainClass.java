package com.global;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		
		//Employee emp = new Employee();
		
		//BeanFactory factory = new XmlBeanFactory(new ClassPathResource("beans.xml"));
		//ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		//ApplicationContext context = new FileSystemXmlApplicationContext("C:\\Users\\princ\\Desktop\\projects\\ioc-container\\src\\beans.xml");
		AbstractApplicationContext context = new FileSystemXmlApplicationContext("C:\\Users\\princ\\Desktop\\projects\\ioc-container\\src\\beans.xml");
		context.registerShutdownHook();
		Employee emp= (Employee) context.getBean("emp");
		emp.setName("aa");
		emp.setSalary(1000.5);
		
		Employee emp2= (Employee) context.getBean("emp");
		emp2.setName("bb");
		emp2.setSalary(1200.3);
		
		emp.printName();
		emp2.printName();
		context.close();
	}
}
