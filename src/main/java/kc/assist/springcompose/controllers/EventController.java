package kc.assist.springcompose.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kc.assist.springcompose.model.Event;
import kc.assist.springcompose.repositories.EventRepository;



@RestController
@RequestMapping("/api/v1/events")
public class EventController {

	private final EventRepository eventRepository;
	
	public EventController(EventRepository eventRepository) {
		this.eventRepository=eventRepository;
	}
	
	@GetMapping("")
	 public List<Event> findAllEvents(){
	        return eventRepository.findAll();
	    }

	
}
