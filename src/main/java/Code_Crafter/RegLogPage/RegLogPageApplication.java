package Code_Crafter.RegLogPage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("Code_Crafter.RegLogPage")
public class RegLogPageApplication {

	public static void main(String[] args) {
		SpringApplication.run(RegLogPageApplication.class, args);
		System.out.println("Application started");
	}

}
