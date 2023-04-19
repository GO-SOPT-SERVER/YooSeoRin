package sopt.org.SecondSeminar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import sopt.org.SecondSeminar.user.service.domain.User;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class SecondSeminarApplication {

	public static List<User> userList;

	public static void main(String[] args) {
		SpringApplication.run(SecondSeminarApplication.class, args);
		userList = new ArrayList<>();
	}

}
