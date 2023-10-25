package kc.assist.springcompose.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import kc.assist.springcompose.model.*;

public interface EventRepository extends JpaRepository<Event, Integer> {

}
