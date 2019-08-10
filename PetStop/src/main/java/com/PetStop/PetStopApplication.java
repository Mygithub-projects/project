package com.PetStop;

import java.util.HashSet;
import java.util.Set;

import javax.sql.DataSource;
import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.PetStop.model.Pet;
import com.PetStop.model.User;
import com.PetStop.repository.PetRepository;
import com.PetStop.repository.UserRepository;

@SpringBootApplication
@EntityScan(basePackages="com.PetStop.*")
@EnableJpaRepositories
public class PetStopApplication {//implements CommandLineRunner {
	
	/*@Autowired
	DataSource dataSource;
	@Autowired
	PetRepository petRepository;
	@Autowired
	UserRepository userRepository;
*/
	static final Logger logger = LoggerFactory.getLogger(PetStopApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(PetStopApplication.class, "1", "geetham");
	}
	/*@Transactional
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		User user1 = new User(18,"var1","varsh");
		   userRepository.save(user1);
		   Set<Pet> petss = new HashSet<Pet>();
		   Pet pp = new Pet(144,"juli",9,"sg");
		   petss.add(pp);
		   pp.setUser(user1);		  
	      petRepository.save(pp);
	      System.out.println("mapped two tables successfully");
		 
			Pageable pageable = PageRequest.of(0, 4);
			Page<Pet> pets = petRepository.findAll(pageable);
			//System.out.println(pets);
			
			for(Pet p:pets){
				System.out.println(p.getPetId()+" "+p.getPetName()+" "+p.getPetAge()+" "+p.getPetPlace());
				}
			System.out.println("finished");
				
}*/
}
