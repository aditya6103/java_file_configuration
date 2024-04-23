package com.jspider.java_file_congiguration.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jspider.java_file_congiguration.entity.User;
import com.jspider.java_file_congiguration.java_config_file.JavaConfiguration;

public class userController {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

ApplicationContext context=new AnnotationConfigApplicationContext(JavaConfiguration.class);
		  
           User user= (User) context.getBean("std1");
               
                    System.out.println(user.getName());
	}

}
