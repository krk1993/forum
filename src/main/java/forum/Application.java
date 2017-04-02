package forum;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

  public static void main(String[] args) {
		System.setProperty("server.port", "8082");
    SpringApplication.run(Application.class, args);
  }

}
