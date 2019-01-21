package aws.mitocode.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

import aws.mitocode.spring.SecurityConfiguration;

@SpringBootApplication
@Import({SwaggerConfig.class, SecurityConfiguration.class})
public class App{

	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}
}
