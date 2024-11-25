package com.springcore.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/springcore/stereotype/stereoconfig.xml");

		Student std1 = (Student) ctx.getBean("student");
		System.out.println(std1);
		System.out.println(std1.getAddress());

	}
}
