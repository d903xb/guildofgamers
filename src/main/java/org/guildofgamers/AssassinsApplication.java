package org.guildofgamers;

import org.guildofgamers.repository.Category;
import org.guildofgamers.repository.CategoryRepository;
import org.guildofgamers.repository.User;
import org.guildofgamers.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;
import java.util.Collection;
import java.util.LinkedList;

@SpringBootApplication
public class AssassinsApplication {

	@Autowired
	private UserRepository userRepository;
	@Autowired
	private CategoryRepository categoryRepository;

	@PostConstruct
	public void init() {
		User francois = new User();
		francois.setUsername("francois");
		userRepository.save(francois);
		User phil = new User();
		phil.setUsername("phil");
		userRepository.save(phil);
		User steve = new User();
		steve.setUsername("steve");
		userRepository.save(steve);
		Collection<User> results = userRepository.findByUsername("steve");
		System.out.println("-----------------");
		System.out.println(results);
		System.out.println("-----------------");
		Category category = new Category();
		User user = new User();
		user.setUsername("ze-user");
		userRepository.save(user);
		LinkedList<User> users = new LinkedList<>();
		users.add(user);
		category.setUsers(users);
		categoryRepository.save(category);

		System.out.println("-----------------");
		System.out.println(userRepository.findByUsernameBetween("a", "z"));
		System.out.println("-----------------");
	}

	public static void main(String[] args) {
		SpringApplication.run(AssassinsApplication.class, args);
	}
}
