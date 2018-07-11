package common.student;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class StudentApp {
	public static void main(String[] args) {
		SpringApplication.run(StudentApp.class, args);
	}
}
