package com.ensa.web.demo;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.ensa.module.entities.Produit;
import com.ensa.module.entities.Role;
import com.ensa.module.entities.User;
import com.ensa.repository.repository.IProduitRepository;
import com.ensa.repository.repository.IRoleRepository;
import com.ensa.repository.repository.IUserRepository;

@SpringBootApplication
@Configuration
@ComponentScan({"com.ensa.*"})
@EntityScan("com.ensa.*")
@EnableJpaRepositories("com.ensa.service.repository")
public class EnsaSpringBoot {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(EnsaSpringBoot.class, args);

		IProduitRepository produitRepository = ctx.getBean(IProduitRepository.class);

		produitRepository.save(new Produit("Livre1", 50, 2000));
		produitRepository.save(new Produit("Cahier1", 200, 5.25f));
		produitRepository.save(new Produit("Stylo1", 500, 2.10f));
		produitRepository.save(new Produit("Cartable1", 500, 50f));
		produitRepository.save(new Produit("Marqueur1", 350, 2.10f));

		produitRepository.save(new Produit("Livre2", 50, 2000));
		produitRepository.save(new Produit("Cahier2", 200, 5.25f));
		produitRepository.save(new Produit("Stylo2", 500, 2.10f));
		produitRepository.save(new Produit("Cartable2", 500, 50f));
		produitRepository.save(new Produit("Marqueur2", 350, 2.10f));

		produitRepository.save(new Produit("Livre3", 50, 2000));
		produitRepository.save(new Produit("Cahier3", 200, 5.25f));
		produitRepository.save(new Produit("Stylo3", 500, 2.10f));
		produitRepository.save(new Produit("Cartable3", 500, 50f));
		produitRepository.save(new Produit("Marqueur3", 350, 2.10f));
		
		IRoleRepository roleRepository = ctx.getBean(IRoleRepository.class);

		Role roleUser = new Role("ROLE_USER");
		Role roleAdmin = new Role("ROLE_ADMIN");
		roleRepository.save(roleUser);
		roleRepository.save(roleAdmin);

		IUserRepository userRepository = ctx.getBean(IUserRepository.class);

		User user = new User("user", "user", true);
		user.setRoles(Arrays.asList(roleUser));
		userRepository.save(user);

		User user1 = new User("amin", "123", true);
		user1.setRoles(Arrays.asList(roleUser));
		userRepository.save(user1);

		User admin = new User("admin", "admin", true);
		admin.setRoles(Arrays.asList(roleUser, roleAdmin));
		userRepository.save(admin);
	}

}
