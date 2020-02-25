package ua.springproj.springapp;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SpringApplication {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext  context = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		TestBean testBean = context.getBean("testBean",TestBean.class);
		System.out.println(testBean.getName());
		context.close();
	}


}
