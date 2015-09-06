package com.mycompany;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.mycompany.service.CustomerService;


public class Application {

	public static void main(String[] args) {
		ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
		CustomerService cs = ac.getBean("customerService", CustomerService.class);
		System.out.println(cs.toString());
		System.out.println(cs.findAll().get(0).getFirstName());

	}

}
