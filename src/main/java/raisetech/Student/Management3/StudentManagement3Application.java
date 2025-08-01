package raisetech.Student.Management3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class StudentManagement3Application {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagement3Application.class, args);
	}

	@GetMapping("/hello")
	public String hello(){
		return "Hello, World!";
	}
}
