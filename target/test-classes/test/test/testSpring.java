package test;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import config.AppConfig;
import spring.helloworld.HelloWorld;

public class testSpring {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void test() {
		 ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		 HelloWorld hw = (HelloWorld) context.getBean("helloBean");
		 hw.sayhello();
	}

}
