package com.ty;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test 
{
	public static void main(String[] args) {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("my_config.xml");
		
		Student stud =(Student)context.getBean("myStudent");
		
		stud.printName();
		System.out.println("========================================");
		ConfigurableApplicationContext context1 = new ClassPathXmlApplicationContext("my_config.xml");
		
		Teacher teacher = (Teacher)context1.getBean("myTeacher");
		
		System.out.println("Teacher name : "+teacher.getName());
		System.out.println("Teacher age  : "+teacher.getAge());
		System.out.println("Teacher salary : "+teacher.getSalary());
	}

}
