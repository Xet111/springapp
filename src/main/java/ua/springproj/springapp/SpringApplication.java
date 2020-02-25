package ua.springproj.springapp;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SpringApplication {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext  context = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		MusicPlayer musicPlayer = context.getBean("musicPlayer",MusicPlayer.class);
		System.out.println(musicPlayer.playMusic());

		context.close();
	}

}
