package com.springcore.spel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/springcore/spel/spelconfig.xml");
		Demo bean = ctx.getBean("demo", Demo.class);
		System.out.println(bean);

	}
}
