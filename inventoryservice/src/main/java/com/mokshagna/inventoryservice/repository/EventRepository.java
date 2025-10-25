package com.mokshagna.inventoryservice.repository;

import com.mokshagna.inventoryservice.entity.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventRepository extends JpaRepository<Event, Long>{
}
