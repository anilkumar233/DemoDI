package springbootdemo.com.sj.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(Application.class, args);
		User user=(User) context.getBean("user1");
		user.invokeAdd();
	}
@Bean(name="user1")
public User user() {
	return new User();
}
@Bean(name="calc1")
public Calc calc() {
	return new CalcA();
}
}
