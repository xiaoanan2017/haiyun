package spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import config.AppConfig;
import spring.helloworld.HelloWorld;
import spring.helloworld.HelloWorldService;
import ssh.dao.UserDao;

public class HelloProgram {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		UserDao us=new UserDao();
       ApplicationContext context =
              new ClassPathXmlApplicationContext("beans.xml");   
		 HelloWorldService service =
	             (HelloWorldService) context.getBean("helloWorldService");                
        HelloWorld hw= service.getHelloWorld();        
        hw.sayhello();
     
    }
}
