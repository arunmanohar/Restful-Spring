package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
    	SpringApplication springApp = new SpringApplication(Application.class);
    	//springApp.
    	springApp.run(args);
        //SpringApplication.run(Application.class, args);
    }
}
