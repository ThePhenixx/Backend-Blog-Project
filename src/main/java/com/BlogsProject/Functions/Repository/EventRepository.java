package com.BlogsProject.Functions.Repository;

import com.BlogsProject.Functions.Entity.Event;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventRepository extends JpaRepository<Event, Integer> {
}
