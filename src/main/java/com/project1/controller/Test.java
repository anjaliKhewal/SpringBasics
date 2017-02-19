package com.project1.controller;

import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Add the bean file to the application context
		FileSystemXmlApplicationContext context= new FileSystemXmlApplicationContext("MySpringBean.xml");
		
		//LoginController loginCtrl=context.getBean(LoginController.class);
		LoginController loginCtrl=(LoginController)context.getBean("loginController");
		
		loginCtrl.sayHello();
		
		context.close();
		
		FileSystemXmlApplicationContext context2= new FileSystemXmlApplicationContext("AnnotationBasedBean.xml");
		
		NameForAnnotation na = (NameForAnnotation)context2.getBean("NameForAnnotation");
		
		System.out.println("Welcome "+na);

		FileSystemXmlApplicationContext context3= new FileSystemXmlApplicationContext("AutoDetectBean.xml");
		AutoDetectBean ab = (AutoDetectBean)context3.getBean("autoDetectBean");
		ab.sayHello();
		
	}

	@Override
	public String toString() {
		return "Test [getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	

}
