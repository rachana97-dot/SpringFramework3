package com.SpringFramework3.SpringFrameworkProg3.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.SpringFramework3.SpringFrameworkProg3.beans.student;

public class Main {
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationcontext.xml");
		student std = (student)context.getBean("student");
		std.display();
	}

}
