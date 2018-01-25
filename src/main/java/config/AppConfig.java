package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import spring.helloworld.HelloWorld;
import spring.helloworld.impl.SpringHelloWorld;
import spring.helloworld.impl.StrutsHelloWorld;

@Configuration
public class AppConfig {
	@Bean(name="helloBean")
	public HelloWorld helloWorld(){
		return new StrutsHelloWorld();
	}
}
