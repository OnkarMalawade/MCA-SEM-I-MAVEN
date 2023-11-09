package demoMaven;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoTest {
	private static ApplicationContext ctx;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ctx = new ClassPathXmlApplicationContext("appConfig.xml");
		Greeting greet=(Greeting) ctx.getBean("greet");
		System.out.println(greet.getMsg());
		greet.setMsg("This is Maven Code...");
		System.out.println(greet.getMsg());
	}

}
