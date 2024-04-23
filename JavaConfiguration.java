package com.jspider.java_file_congiguration.java_config_file;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.jspider.java_file_congiguration.entity.User;

@Configuration
public class JavaConfiguration {
     
	@Bean
	public User std1()
	{
		User user=new User();
		user.setName("aditya");
		user.setId(12);
		user.setEmailid("adityaujjawal99@gmail.com");
		
		return user;
	}
	
	
	
	
	
	
	
}
