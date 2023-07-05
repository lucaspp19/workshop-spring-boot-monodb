package com.lucaspp.workkshopmongo.config;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.lucaspp.workkshopmongo.dto.AuthorDTO;
import com.lucaspp.workkshopmongo.entities.Post;
import com.lucaspp.workkshopmongo.entities.User;
import com.lucaspp.workkshopmongo.repository.PostRepository;
import com.lucaspp.workkshopmongo.repository.UserRepository;

@Configuration
public class Instantiation implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private PostRepository postRepository;

	@Override
	public void run(String... args) throws Exception {

		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		userRepository.deleteAll();
		postRepository.deleteAll();

		User maria = new User(null, "Maria Brown", "maria@gmail.com");
		User alex = new User(null, "Alex Green", "alex@gmail.com");
		User bob = new User(null, "Bob Grey", "bob@gmail.com");
		
		userRepository.saveAll(Arrays.asList(maria, alex, bob));

		Post post1 = new Post(null, LocalDate.parse("21/03/2018", fmt), "Partiu viagem",
				"vou viaja para São Paulo. Abraços!", new AuthorDTO(maria));
		Post post2 = new Post(null, LocalDate.parse("23/03/2018", fmt), "Bom dia!",
				"Acordei feliz hoje!", new AuthorDTO(maria));

		postRepository.saveAll(Arrays.asList(post1, post2));

	}

}
