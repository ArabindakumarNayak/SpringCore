package com.springcore.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/springcore/stereotype/stereoconfig.xml");

		Student std1 = (Student) ctx.getBean("std");
//		System.out.println(std1);
//		System.out.println(std1.getAddress());

		System.out.println(std1.hashCode());

		Student std2 = (Student) ctx.getBean("std");
		System.out.println(std2.hashCode());

		ApplicationContext ctx2 = new ClassPathXmlApplicationContext("com/springcore/stereotype/stereoconfig.xml");
		Teacher t1 = (Teacher) ctx2.getBean("t1");
		System.out.println(t1.hashCode());
		Teacher t2 = (Teacher) ctx2.getBean("t1");
		System.out.println(t2.hashCode());

	}
}
