package com.codenation.curso.central.error;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


//@EnableJpaAuditing
@SpringBootApplication
public class CentralErrosApplication {

	public static void main(String[] args) {
		SpringApplication.run(CentralErrosApplication.class, args);
		//System.out.println(new BCryptPasswordEncoder().encode("123"));
	}
	/*@Bean
    public CommandLineRunner run(UserRepository userRepository) throws Exception {
        return (String[] args) -> {
            User user1 = new User("Bob", "bob@domain.com");
            User user2 = new User("Jenny", "jenny@domain.com");
            userRepository.save(user1);
            userRepository.save(user2);
            userRepository.findAll().forEach(System.out::println);
        };
    }
    */
}
