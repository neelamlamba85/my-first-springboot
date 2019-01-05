package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class GithubSpringDemoApplication {

	public static void main(String[] args)
	{
		ApplicationContext appContext=SpringApplication.run(GithubSpringDemoApplication.class, args);
		Add add=appContext.getBean(Add.class);
		int result=add.addition();
		System.out.println(" addition 2"+result);
		System.out.println(" addition 1"+result);
	}


}

