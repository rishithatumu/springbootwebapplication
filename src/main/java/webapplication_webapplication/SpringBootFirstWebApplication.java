package webapplication_webapplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.springboot.web")
public class SpringBootFirstWebApplication 
{
	public static void main(String[] args)
	{
        SpringApplication.run(SpringBootFirstWebApplication.class, args);
    }
}
