package kc.assist.springcompose;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import kc.assist.springcompose.model.Event;
import kc.assist.springcompose.repositories.EventRepository;

@SpringBootApplication
public class SpringComposeApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringComposeApplication.class, args);
	}
	   @Bean
	    CommandLineRunner commandLineRunner(EventRepository eventRepository){
	        return args -> {
	            if(eventRepository.count()==0){
	                eventRepository.save(new Event(1,"Event-1"));
	                eventRepository.save(new Event(2,"EVENT-2"));
	                eventRepository.save(new Event(3,"EVENT-3"));
	            }
	        };
	    }

}
